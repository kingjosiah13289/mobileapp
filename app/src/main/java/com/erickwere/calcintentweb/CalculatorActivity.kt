package com.erickwere.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Buttonadd:Button
    lateinit var Buttonsub:Button
    lateinit var Buttonmult:Button
    lateinit var Buttondiv:Button
    lateinit var Editfnum:EditText
    lateinit var EditSnum:EditText
    lateinit var TextAnswer:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        Buttonadd=findViewById(R.id.Btn_Add)
        Buttondiv=findViewById(R.id.Btn_divide)
        Buttonmult=findViewById(R.id.Btn_multiply)
        Buttonsub=findViewById(R.id.Btn_Sub)
//        Buttonsub=findViewById(R.id.Btn_Intent)
        Editfnum=findViewById(R.id.Edt_fnum)
        EditSnum=findViewById(R.id.Edt_Snum)
        TextAnswer=findViewById(R.id.Txt_Answer)


        Buttonadd.setOnClickListener {
            var fnum=Editfnum.text.toString()
            var snum=EditSnum.text.toString()

            if (fnum.isEmpty() && snum.isEmpty()){

                TextAnswer.text="Please fill in input details"
            }else{
                var Answer=fnum.toDouble() + snum.toDouble()

                TextAnswer.text=Answer.toString()

            }

        }










    }
}