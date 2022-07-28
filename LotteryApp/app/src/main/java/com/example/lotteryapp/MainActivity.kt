package com.example.lotteryapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var currentNums: String // 로또 번호 만들 때마다 여기에 저장(클래스의 속성 -> 나중에 접근하기 위함)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //SharedPreferences 객체를 가져오기
        val pref = getSharedPreferences("nums", Context.MODE_PRIVATE)

        val lottoNumView = findViewById<TextView>(R.id.lotto_num)

        currentNums = generateRandomLottoNum(6, "-", true)
        lottoNumView.text = currentNums

        val generateButton = findViewById<Button>(R.id.generate)
        generateButton.setOnClickListener{
            currentNums = generateRandomLottoNum(6, "-", true) //로또 번호를 현재 로또 번호에 저장함(나중에 접근하기 위해서 저장)
            lottoNumView.text = currentNums
        }

        val saveButton = findViewById<Button>(R.id.save)
        saveButton.setOnClickListener{
            var lottoNums = pref.getString("lottonums", "") // 키로 저장된 것이 없으면 두번째 인자로 대체함
            var numList = if(lottoNums == "") {
                mutableListOf<String>()
            }else {
                lottoNums!!.split(",").toMutableList()
            }
            numList.add(currentNums)

            val editor = pref.edit()
            editor.putString("lottonums", numList.joinToString(","))
            editor.apply()
        }

        findViewById<Button>(R.id.num_list).setOnClickListener {
            val intent = Intent(this, LotteryNumListActivity::class.java)
            startActivity(intent)
        }

        val checkButton = findViewById<Button>(R.id.check)
        checkButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.dhlottery.co.kr/gameResultdo?method=byWin&wiselog=M_A_1_8"))
            startActivity(intent)
        }
    }

    // 수를 몇 개 넘길 것인지 -> cnt, 어떻게 연결할 것인지 -> sep, 중복을 허용할 것인지 -> bool(나중에 구현해보기)
    fun generateRandomLottoNum(cnt: Int = 6, sep: String = "-", bool: Boolean = false): String{
        // nums에 아무것도 없어서 타입 추론 불가 -> 타입을 써줌(mutableListOf<Int>()
        val nums = mutableListOf<Int>()

        // 랜덤 함수(6번 반복)
        for(i in 1..cnt) {
            nums.add((1..45).random())
        }

        //로그로 먼저 출력해보기
        Log.d("my_tag", nums.joinToString(sep))

        // 배열을 joinToString 사용 -> 문자열로 변환하여 출력(그냥 반복문 써도 됨)
        return nums.joinToString("-")
    }
}

