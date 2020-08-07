package jp.techacademy.shuzo.kotlinlog

import android.util.Log

open class Human : Animal,Thinkable {
    var hobby : String
    //引数付きコンストラクタ
    constructor(name:String,age:Int,hobby:String):super(name,age){
        this.name=name
        this.age=age
        this.hobby=hobby

    }
    //メソッド
    override fun say(){
        Log.d(MY_TAG,"私の名前は、"+this.name +"です。年齢は、" + this.age +"歳です." )
    }

    override fun think(){

        Log.d(MY_TAG,"私は、"+this.hobby +"について考える." )

    }


}