package com.gmail.nguyenkimngan190920.excersise2_buoi5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView


class MainActivity : AppCompatActivity() {
    val bankSource = listOf<BankInfo>(
            BankInfo("ACB", established ="4/6/1993", logo = R.drawable.acb),
            BankInfo("TPBank", established ="2008", logo = R.drawable.tpbank),
            BankInfo("Đông Á Bank", established ="01/07/1992", logo = R.drawable.donga),
            BankInfo("SeABank", established ="1994", logo = R.drawable.sea),
            BankInfo("ABBank", established ="13/5/1993", logo = R.drawable.ab),
            BankInfo("BacA Bank", established ="1994", logo = R.drawable.baca),
            BankInfo("MSB", established ="12/7/1991", logo = R.drawable.msb),
            BankInfo("Techcombank", established ="27/09/1993", logo = R.drawable.techcombank),
            BankInfo("VPBank", established ="1993", logo = R.drawable.vp),
            BankInfo("HDBank", established ="1989", logo = R.drawable.hd),
            BankInfo("PVcombank", established ="16/09/2013", logo = R.drawable.pv),
            BankInfo("SHB", established ="13/11/1993", logo = R.drawable.shb),
            BankInfo("Sacombank", established ="21/12/1991", logo = R.drawable.sacombank),
            BankInfo("Eximbank", established ="1989", logo = R.drawable.eximbank)

    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bankListView = findViewById<ListView>(R.id.logoLV)
        val bankAdapter = BankAdapter(this,bankSource)
        bankListView.adapter = bankAdapter
    }
}