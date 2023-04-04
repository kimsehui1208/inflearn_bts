package com.example.inflearn_bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 화면이 클릭되었다는 것을 알아야한다(프로그램이)
        val image1 = findViewById<ImageView>(R.id.image_1)
        image1.setOnClickListener {

            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()

            //2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여준다. // intent 하는 문장
            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }
        val image2 = findViewById<ImageView>(R.id.image_2)
        image2.setOnClickListener {

            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }
        val image3 = findViewById<ImageView>(R.id.image_3)
        image3.setOnClickListener {

            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }
        val image4 = findViewById<ImageView>(R.id.image_4)
        image4.setOnClickListener {

            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)
        }
        val image5 = findViewById<ImageView>(R.id.image_5)
        image5.setOnClickListener {

            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)
        }
        val image6 = findViewById<ImageView>(R.id.image_6)
        image6.setOnClickListener {

            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)
        }
        val image7 = findViewById<ImageView>(R.id.image_7)
        image7.setOnClickListener {

            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)
        }

    }
}