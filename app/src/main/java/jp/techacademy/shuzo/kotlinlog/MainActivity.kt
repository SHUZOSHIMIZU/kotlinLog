package jp.techacademy.shuzo.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
// パッケージレベルに定義した定数
const val MY_TAG = "kotlintest"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val human1 = Human("田中",55,"テニス")
        val human2 = Human("清水",60,"音楽")
        human1.say()
        human1.think()
        human2.say()
        human2.think()

        /*
            Log.d("kotlintest",total(35,55).toString())

            val dog=Dog("ポチ",3)   //名前をポチ、年齢3歳で、Dogのインスタンス
            dog.say()
            Log.d( MY_TAG,"犬の名前は"+dog.name+"です")
            Log.d( MY_TAG,"犬の年齢は"+dog.age+"です")

            dog.move()


            val bigdog=BigDog("ヨーゼフ",15)
            bigdog.say()
            Log.d("kotlintest","犬の名前は"+bigdog.name+"です")
            Log.d("kotlintest","犬の年齢は"+bigdog.age+"です")
            Log.d(MY_TAG,Dog.to_jp+"クラスの変数です")
            Dog.introduce()
        */
    }

private fun total(first: Int,last: Int): Int{
    var sum=0
    for (i in first..last){
        sum+=i
    }
        return sum
}


}
