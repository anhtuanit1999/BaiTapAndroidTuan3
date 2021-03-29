package com.example.baitapandroidtuan3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ChonMuaActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMacDinh, btnMauDo, btnMauDen, btnMauXanh;
    private ImageView imgV_SP;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chonmau_sanpham);
        btnMacDinh = findViewById(R.id.btnMacDinh);
        btnMauDo = findViewById(R.id.btnMauDo);
        btnMauDen = findViewById(R.id.btnMauDen);
        btnMauXanh = findViewById(R.id.btnMauXanh);
        imgV_SP = findViewById(R.id.imgV_SP);
        intent = getIntent();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMacDinh:
//                imgV_SP.setImageDrawable(R.drawable.vs_bac);
                SanPhamDienThoai sp1 = new SanPhamDienThoai(
                        "Điện Thoại Vsmart Joy 3 Hàng chính hãng",
                        Colors.DEFAUTL, "Tiki Trading", 1790000
                        );
                intent.putExtra("sanpham", sp1);
                break;
            case R.id.btnMauDo:
                SanPhamDienThoai sp2 = new SanPhamDienThoai(
                        "Điện Thoại Vsmart Joy 3 Hàng chính hãng",
                        Colors.MAUDO, "Tiki Trading", 1790000
                );
                intent.putExtra("sanpham", sp2);
                break;
            case R.id.btnMauDen:
                SanPhamDienThoai sp3 = new SanPhamDienThoai(
                        "Điện Thoại Vsmart Joy 3 Hàng chính hãng",
                        Colors.MAUDEN, "Tiki Trading", 1790000
                );
                intent.putExtra("sanpham", sp3);
                break;
            case R.id.btnMauXanh:
                SanPhamDienThoai sp4 = new SanPhamDienThoai(
                        "Điện Thoại Vsmart Joy 3 Hàng chính hãng",
                        Colors.MAUXANH, "Tiki Trading", 1790000
                );
                intent.putExtra("sanpham", sp4);
                break;
            default: break;
        }
    }
}
