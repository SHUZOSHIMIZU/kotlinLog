package jp.techacademy.shuzo.kotlinlog
import android.util.Log
open class Dog :Animal,Movable{
    //プロパティ
    //var name: String
    //var age :Int
    //コンストラクタ
    constructor(name:String,age:Int):super(name,age){
        this.name=name
        this.age=age
    }
    companion object{
        val to_jp="犬"
        fun introduce(){
            Log.d(MY_TAG,"これは犬クラスです")
        }
    }
    //メソッド
    override fun say(){
        Log.d(MY_TAG,this.name +"(" + this.age +"歳)"+ "[ワンワン]")
    }
    override fun move(){
        Log.d(MY_TAG,this.name +"(" + this.age +"歳)"+ "は全力で走った")
    }

}