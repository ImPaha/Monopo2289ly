package com.example.monopoly


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import android.app.Dialog
import android.content.DialogInterface
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.monopoly.firstPlayer.totalMoney as totalMoney1

object firstPlayer{
    val personage : String = "Машина"
    var prisonIndex : Int = 0
    var nagat = ""
    var SzIt =""
    var ogar =""
    var perpark = ""
    var vars = ""
    var sret = ""
    var polyan = ""
    var rost = ""
    var rubl = ""
    var ryaz =""
    var vaviv = ""
    var may = ""
    var pus = ""
    var tver = ""
    var gruz = ""
    var chaiii = ""
    var smol = ""
    var sus = ""
    var gog = ""
    var kut = ""
    var mb = ""
    var arb = ""
    var go : Int = 0
    var pole : Int = 1
    var goEnabled: Boolean = true
    var money : Int = 1500
    var propertys : Array<String> = arrayOf()
    var totalMoney : Int = 1500
    var numProperty : Int = 0


}
object secondPlayer{
    val personage : String = "Самолёт"
    var prisonIndex : Int = 0
    var nagat = ""
    var SzIt =""
    var ogar =""
    var perpark = ""
    var vars = ""
    var sret = ""
    var polyan = ""
    var rost = ""
    var rubl = ""
    var ryaz =""
    var vaviv = ""
    var may = ""
    var pus = ""
    var tver = ""
    var gruz = ""
    var chaiii = ""
    var smol = ""
    var sus = ""
    var gog = ""
    var kut = ""
    var mb = ""
    var arb = ""
    var go : Int = 0
    var pole : Int = 1
    var goEnabled: Boolean = false
    var money : Int = 1500
    var propertys : Array<String> = arrayOf()
    var numProperty : Int = 0
    var totalMoney : Int = 1500
}
object thirdPlayer{
    val personage : String = "Лайнер"
    var prisonIndex : Int = 0
    var nagat = ""
    var SzIt =""
    var ogar =""
    var perpark = ""
    var vars = ""
    var sret = ""
    var polyan = ""
    var rost = ""
    var rubl = ""
    var ryaz =""
    var vaviv = ""
    var may = ""
    var pus = ""
    var tver = ""
    var gruz = ""
    var chaiii = ""
    var smol = ""
    var sus = ""
    var gog = ""
    var kut = ""
    var mb = ""
    var arb = ""
    var go : Int = 0
    var pole : Int = 1
    var goEnabled: Boolean = false
    var money : Int = 1500
    var propertys : Array<String> = arrayOf()
    var numProperty : Int = 0
    var totalMoney : Int = 1500
}
object fourthPlayer{
    val personage : String = "Вертолет"
    var prisonIndex : Int = 0
    var nagat = ""
    var SzIt =""
    var ogar =""
    var perpark = ""
    var vars = ""
    var sret = ""
    var polyan = ""
    var rost = ""
    var rubl = ""
    var ryaz =""
    var vaviv = ""
    var may = ""
    var pus = ""
    var tver = ""
    var gruz = ""
    var chaiii = ""
    var smol = ""
    var sus = ""
    var gog = ""
    var kut = ""
    var mb = ""
    var arb = ""
    var go = 0
    var pole : Int = 1
    var goEnabled: Boolean = false
    var money : Int = 1500
    var propertys : Array<String> = arrayOf()
    var numProperty : Int = 0
    var totalMoney : Int = 1500
}
class MainActivity : AppCompatActivity() {
    var fp: firstPlayer = firstPlayer
    var sp: secondPlayer = secondPlayer
    var tp: thirdPlayer = thirdPlayer
    var gameIsGoing : Boolean = true
    var lp : fourthPlayer = fourthPlayer
    var poles: Array<String> = arrayOf(

        "22 (Улица Тверская)",
        "23(Карточка Шанс)",
        "24(Улица Пушкина)",
        "25(Площадь Маяковского)",
        "26(Железная Дорога)",
        "27(Улциа Грузинский вал)",
        "28(Улица Чаяковского)",
        "29(Водопровод)",
        "30(Смоленская Площадь)",
        "31(Отправляйтесь в тюрьму)",
        "32(Улциа Щусева)",
        "33(Гоголевский бульвар)",
        "34(Карточка Общественная казна)",
        "35(Кутузовский проспект)",
        "36(ЖД станция)",
        "37(Карточка Шанс)",
        "38(Улица Малая Бронная)",
        "39(СверхНалог)",
        "40(Улциа Арбат)"
    )
    var truePoles: Array<Int> = arrayOf(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10,
        11,
        12,
        13,
        14,
        15,
        16,
        17,
        18,
        19,
        20,
        21,
        22,
        23,
        24,
        25,
        26,
        27,
        28,
        29,
        30,
        31,
        32,
        33,
        34,
        35,
        36
    )
    val lS = LightStation()
    val wS = WaterStation()
    val sr = SRailStation()
    val thr = TRailStation()
    val fors = FoRailStation()
    var pole = 1
    var totalMoneytipriemniy = 1500
    var money = 1500
    var suseva = Suseva()
    var nagat = Nagat()
    var zit = Szit()
    var sretenka = Sretenka()
    var polyanka = Polyanka()
    var kutuzov = Kutuzov()
    var chaik = Chaik()
    var tversk = Tversk()
    var mayak = Mayak()
    var arbat = Arbat()
    var malenbron = Malenbron()
    var gogol = Gogol()
    var vavilovo = Vavilovo()
    var varshavsk = Varshavsk()
    var casnCard: Int = 0
    var gruzin = Gruzin()
    var novinsk = Novinsk()
    var ogarev: Ogarev = Ogarev()
    var pervpark = Pervpark()
    var pushkin = Pushkin()
    var rublevka = Rublevka()
    var rostov = Rostov()
    var ryazan = Ryazan()
    var fignya: Int = 0

    var fRailStation = FRailStation()


    var casn: Array<String> = arrayOf(
        "Идите на поле вперед и получите 200",
        "Бесплатное освобождение из тюрьмы",
        "Вы получаете в наследство 100",
        "Вы отправляетесь в тюрьму",
        "Возмещение подоходного налога, получите 20",
        "Визит к врачу. Заплатите 50",
        "Сегодня ваш День Рождение! Получите 10 от каждого игрока",
        "От вас требуется провести ремонтные работы. Заплатите 60 за каждый домик и 120 за каждый отель",
        "На продаже акций ты зарабатываешь 50!",
        "Оплатите расходы на гозпитализацию в размере 100"
    )
    var chance: Array<String> = arrayOf(
        "Вернитесь на 3 поля назад",
        "Отправляйтесь на улицу Арбат",
        "Бесплатное освобождение из тюрьмы",
        "Отправляйтесь на площадь Маяковского",
        "Идите на ближающию жд станцию, если она является чей-то собственостью, то заплатите арендную плату вдвое превышающию обычную",
        "Штраф за привышение скорости 15",
        "Идите на поле ВПЕРЕД и получите 200",
        "Идите на ближающую коммунальню станцию, если она является чей-то собственностью, то заплатите арендную плату превышающую обычную в 10 раз",
        "Отправляйтесь на улицу ПОЛЯНКА"
    )
    var randCardRRR: Int = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        var Characters: Array<String> = arrayOf("Car", "Plane", "Helicopter", "Boat")
//        var Homes: Array<String> = arrayOf(
//            "one's home",
//            "two's home",
//            "tree's home",
//            "fourth home",
//            "one's hotel",
//            "two's hotel",
//            "tree's hotel",
//            "fourth hotel"
//        )
//        var Streets: Array<String> = arrayOf(
//            "Нагатинская",
//            "Житная",
//            "Огарево",
//            "Первая парковая",
//            "Пушкина",
//            "Щусева",
//            "Рязанский проспект",
//            "Сретенка",
//            "Рублевское шоссе",
//            "Кутузовский проспект",
//            "Малая бронная",
//            "Полянка",
//            "Арбат",
//            "Гоголевский бульвар",
//            "Новинский бульвар",
//            "площадь Маяковского",
//            "Вавилово",
//            "Тверская",
//            "Грузинский вал",
//            "Чайковского",
//            "Варшавское шоссе",
//            "Ростовская набережная"
//        )

    }
    fun fpfr(){
        AlertDialog.Builder(this).apply {
            setTitle("Выберите поле на которое хотите переместиться")

            setItems(
                poles

            ) { dialog, which ->
                fp.pole = truePoles[which.toInt()]
            }
            create().show()
        }
        fp.totalMoney = fp.totalMoney - 100
    }
    fun randrand(v: View) {
        if (gameIsGoing == true){

            if (fp.goEnabled == true) {
                if (fp.prisonIndex < 1)

    moneyy.setText(fp.money.toString())




              fp.pole = fp.pole + fp.go
      //
                fp.pole = 22
              //  fp.go = (2..12).random()
                if (fp.totalMoney >= 100){
                    if (fp.pole==22) {
                        AlertDialog.Builder(this).apply {
                            setTitle("Выберите решение")

                            setMessage("Хотите заплатить 100 и отправится любое поле до поля ВПЕРЕД включительно?")
                            setCancelable(true)
                            setPositiveButton("Да, хочу") { dialog, id ->
                                //     fr()
                                fp.totalMoney = fp.totalMoney - 100
                                fpfr()
                                //   money = money - 100


                            }
                            setNegativeButton("Нет, не хочу") { dialog, id ->

                            }
                            create().show()
                        }
                    }
                }

                if (fp.pole > 40) {
                    fp.pole = fp.pole - 40
                    fp.money = fp.money + 200
                }
                if (fp.pole == 0) {
                    fp.pole++
                }

                poleee.text = fp.go.toString()
                if (fp.totalMoney >= 100){
                    if (fp.pole==22) {
                        AlertDialog.Builder(this).apply {
                            setTitle("Выберите решение")
                            setMessage("Хотите заплатить 100 и отправится любое поле до поля ВПЕРЕД включительно?")
                            setCancelable(true)
                            setPositiveButton("Да, хочу") { dialog, id ->
                                //     fr()
                                totalMoney1 = totalMoney1 - 100
                                fpfr()
                                //   money = money - 100


                            }
                            setNegativeButton("Нет, не хочу") { dialog, id ->

                            }
                            create().show()
                        }
                    }
                }
                if (fp.pole == 24){
                    casnCard = (0..9).random()
                    if (casnCard == 0){
                        fp.pole = 1
                        fp.totalMoney = fp.totalMoney + 200
                    }
                    if (casnCard == 2){
                        fp.totalMoney = fp.totalMoney + 100
                    }
                    if (casnCard == 4){
                        fp.totalMoney = fp.totalMoney + 20
                    }
                    if(casnCard == 5){
                        fp.totalMoney = fp.totalMoney - 50
                    }
                    if (casnCard == 6){
                        fp.totalMoney = fp.totalMoney + 30
                        sp.totalMoney = sp.totalMoney - 10
                        tp.totalMoney = tp.totalMoney - 10
                        lp.totalMoney = lp.totalMoney - 10
                    }
                    if (casnCard == 8){
                        fp.totalMoney = fp.totalMoney + 50
                    }
                    if (casnCard == 9){
                        fp.totalMoney = fp.totalMoney - 100
                    }
                    AlertDialog.Builder(this).apply {
                        setTitle("Карточка ОБЩЕСТВЕННАЯ КАЗНА")
                        setMessage(casn[casnCard])
                        create().show()
                    }
                }

                if (fp.pole == 8){
                    var chanceCardRRR = 0
                    chanceCardRRR = (0..9).random()
                    if (chanceCardRRR == 0){
                        fp.pole = fp.pole - 3
                    }
                    if (chanceCardRRR ==1){
                        fp.pole = 40
                    }
                    if (chanceCardRRR == 2){
                        fp.prisonIndex = fp.prisonIndex - 1
                    }
                    if (chanceCardRRR==3){
                        fp.pole = 26
                    }
                    if (chanceCardRRR == 5){
                        fp.totalMoney =  fp.totalMoney - 15
                    }
                    AlertDialog.Builder(this).apply {
                        setTitle("Карточка ШАНС")
                        setMessage(chance[chanceCardRRR])
                        create().show()
                    }
                }
                if (fp.pole==35)  {
                    casnCard = (0..9).random()
                    if (casnCard == 0){
                        fp.pole = 1
                        fp.totalMoney = fp.totalMoney + 200
                    }
                    if (casnCard == 2){
                        fp.totalMoney = fp.totalMoney + 100
                    }
                    if (casnCard == 4){
                        fp.totalMoney = fp.totalMoney + 20
                    }
                    if(casnCard == 5){
                        fp.totalMoney = fp.totalMoney - 50
                    }
                    if (casnCard == 6){
                        fp.totalMoney = fp.totalMoney + 30
                        sp.totalMoney = sp.totalMoney - 10
                        tp.totalMoney = tp.totalMoney - 10
                        lp.totalMoney = lp.totalMoney - 10
                    }
                    if (casnCard == 8){
                        fp.totalMoney = fp.totalMoney + 50
                    }
                    if (casnCard == 9){
                        fp.totalMoney = fp.totalMoney - 100
                    }
                    AlertDialog.Builder(this).apply {
                        setTitle("Карточка ОБЩЕСТВЕННАЯ КАЗНА")
                        setMessage(casn[casnCard])
                    }
                    // chanceView.setText(chance[casnCard])
                }
                if (fp.pole==18)  {
                    casnCard = (0..9).random()
                    if (casnCard == 0){
                        fp.pole = 1
                        fp.totalMoney = fp.totalMoney + 200
                    }
                    if (casnCard == 2){
                        fp.totalMoney = fp.totalMoney + 100
                    }
                    if (casnCard == 4){
                        fp.totalMoney = fp.totalMoney + 20
                    }
                    if(casnCard == 5){
                        fp.totalMoney = fp.totalMoney - 50
                    }
                    if (casnCard == 6){
                        fp.totalMoney = fp.totalMoney + 30
                        sp.totalMoney = sp.totalMoney - 10
                        tp.totalMoney = tp.totalMoney - 10
                        lp.totalMoney = lp.totalMoney - 10
                    }
                    if (casnCard == 8){
                        fp.totalMoney = fp.totalMoney + 50
                    }
                    if (casnCard == 9){
                        fp.totalMoney = fp.totalMoney - 100
                    }
                    AlertDialog.Builder(this).apply {
                        setTitle("Карточка ОБЩЕСТВЕННАЯ КАЗНА")
                        setMessage(casn[casnCard])
                    }
                    chanceView.setText(chance[casnCard])
                }
                //stoyanka()
                if (fp.pole == 39){

                   fp.totalMoney = fp.totalMoney - 100
                    AlertDialog.Builder(this).apply {
                        setTitle("Налог!")
                        setMessage("Вы заплатили 100")
                        create().show()

                    }
                    moneyy.setText(fp.totalMoney.toString())
                }
                if (fp.pole ==1){

                }
                if (fp.pole == 2){
                    if (nagat.alreadyBought == false){
                        AlertDialog.Builder(this).apply {
                            setTitle("Выберите решение")
                            setMessage("Хотите заплатить 60 и и купить улицу НАГАТИНСКАЯ?")
                            setCancelable(true)
                            setPositiveButton("Да, хочу") { dialog, id ->

                                fp.money = fp.money - 60
                                fp.nagat = "Нагатинская"
                                //        fp.propertys[fp.numProperty] = "Улциа НАГАТИНСКАЯ"
                                nagat.alreadyBought = true

                            }

                            setNegativeButton("Нет, не хочу") { dialog, id ->

                            }
                            create().show()
                        }
                    }
                    else{
                        fp.totalMoney = fp.totalMoney - nagat.rent
                        nagat.rent = nagat.sRent
                    }

                }
                if (pole == 32){
                    fp.prisonIndex = fp.prisonIndex + 1
                    fp.pole = 11
                    AlertDialog.Builder(this).apply {
                        setTitle("Отправляйтесь в тюрьму")
                        setMessage("Вы попались на не законных делах")
                    }
                }
                if (fp.pole==3){
                    casnCard = (0..9).random()
                    if (casnCard == 0){
                        fp.pole = 1
                        fp.totalMoney = fp.totalMoney + 200
                    }
                    if (casnCard == 2){
                        fp.totalMoney = fp.totalMoney + 100
                    }
                    if (casnCard == 4){
                        fp.totalMoney = fp.totalMoney + 20
                    }
                    if(casnCard == 5){
                        fp.totalMoney = fp.totalMoney - 50
                    }
                    if (casnCard == 6){
                        fp.totalMoney = fp.totalMoney + 30
                        sp.totalMoney = sp.totalMoney - 10
                        tp.totalMoney = tp.totalMoney - 10
                        lp.totalMoney = lp.totalMoney - 10
                    }
                    if (casnCard == 8){
                        fp.totalMoney = fp.totalMoney + 50
                    }
                    if (casnCard == 9){
                        fp.totalMoney = fp.totalMoney - 100
                    }
                }
                if (fp.pole == 24){
                    var chanceCardRRR = 0
                    chanceCardRRR = (0..9).random()
                    if (chanceCardRRR == 0){
                        fp.pole = fp.pole - 3
                    }
                    if (chanceCardRRR ==1){
                        fp.pole = 40
                    }
                    if (chanceCardRRR == 2){
                        fp.prisonIndex = fp.prisonIndex - 1
                    }
                    if (chanceCardRRR==3){
                        fp.pole = 26
                    }
                    if (chanceCardRRR == 4){

                    }
                    AlertDialog.Builder(this).apply {
                        setTitle("Карточка ШАНС")
                        setMessage(chance[chanceCardRRR])
                        create().show()
                    }
                }
                if (fp.pole == 4){
                    if (zit.alreadyBought == false){
                        AlertDialog.Builder(this).apply {
                            setTitle("Выберите решение")
                            setMessage("Хотите заплатить 60 и и купить улицу ЖИТНАЯ?")
                            setCancelable(true)
                            setPositiveButton("Да, хочу") { dialog, id ->

                                fp.money = fp.money - 60
                                fp.SzIt = "Житная"
                                //        fp.propertys[fp.numProperty] = "Улциа НАГАТИНСКАЯ"
                                zit.alreadyBought = true

                            }

                            setNegativeButton("Нет, не хочу") { dialog, id ->

                            }
                            create().show()
                        }
                    }
                }
                if (fp.pole==5){
                    fp.totalMoney = fp.totalMoney - 200
                    AlertDialog.Builder(this).apply {
                        setTitle("Подоходный налог!")
                        setMessage("Вы заплатили 200")
                    }
                }
            }
        }


    }

    fun spfr(){
        AlertDialog.Builder(this).apply {
            setTitle("Выберите поле на которое хотите переместиться")

            setItems(
                poles

            ) { dialog, which ->
                sp.pole = truePoles[which.toInt()]
            }
            create().show()
        }
    }
    fun thfr(){
        AlertDialog.Builder(this).apply {
            setTitle("Выберите поле на которое хотите переместиться")

            setItems(
                poles

            ) { dialog, which ->
                tp.pole = truePoles[which.toInt()]
            }
            create().show()
        }
    }
    fun fopfr(){
        AlertDialog.Builder(this).apply {
            setTitle("Выберите поле на которое хотите переместиться")

            setItems(
                poles

            ) { dialog, which ->
                fp.pole = truePoles[which.toInt()]
            }
            create().show()
        }
    }

    fun stoyanka() {
        AlertDialog.Builder(this).apply {
            setTitle("Выберите решение")
            setMessage("Хотите заплатить 100 и отправится любое поле до поля ВПЕРЕД включительно?")
            setCancelable(true)
            setPositiveButton("Да, хочу") { dialog, id ->
                fr()
                money = money - 100


            }
            setNegativeButton("Нет, не хочу") { dialog, id ->

            }
            create().show()
        }
    }
    fun nalog(){
        if (fp.pole == 39){
            totalMoney1 = totalMoney1 - 100
            AlertDialog.Builder(this).apply {
                setTitle("Налог!")
                setMessage("Вы заплатили 100")
                create().show()
            }
        }
    }

    fun chanceCardd() {
        randCardRRR = (0..9).random()
        sss.setText(chance[randCardRRR])

    }


    fun casnCardd() {
        casnCard = (0..9).random()
        chanceView.setText(chance[casnCard])

    }

    fun prison() {
        fignya = 1

        if (fignya == 1) {
            //         goEnabled = false
        }

        fun stoyanka() {
            AlertDialog.Builder(this).apply {
                setTitle("Выберите решение")
                setMessage("Хотите заплатить 100 и отправится любое поле до поля ВПЕРЕД включительно?")
                setCancelable(true)
                setPositiveButton("Да, хочу") { dialog, id ->
                    //   fr()
                    money = money - 100


                }
                setNegativeButton("Нет, не хочу") { dialog, id ->

                }
                create()
            }

        }

        fun buyStreet() {
            // if (****.alreadyBought == true){
            // ****.payRent()
            // }
        }

        fun payRent() {

            //   money = money - ****.rent
        }


    }


    fun fr() {
        AlertDialog.Builder(this).apply {
            setTitle("Выберите поле на которое хотите переместиться")

            setItems(
                poles

            ) { dialog, which ->
                pole = truePoles[which]
            }
            create().show()
        }
        fun test() {

        }

    }
}

private fun stoyanka() {
    //    AlertDialog.Builder(this).apply {
    //        setTitle("Выберите решение")
    //         setMessage("Хотите заплатить 100 и отправится любое поле до поля ВПЕРЕД включительно?")
    //       setCancelable(true)
    //        setPositiveButton("Да, хочу") { dialog, id ->
    //               fr()
    //     money = money - 100


}
//    setNegativeButton("Нет, не хочу") { dialog, id ->


//create()




private fun fr() {
    // AlertDialog.Builder(this).apply {
    //   setTitle("Выберите поле на которое хотите переместиться")

    ///   setItems(
    //        poles

    //    ) { dialog, which ->
    ///         pole = truePoles[which]
}
//   create().show()




class Nagat {
    var alreadyBought: Boolean = false
    var naame = "Улица Нагатинская"
    var colorCategoryDDDDD = "Коричневая"

    var price = 60

    var rent = 70
    var rent_level = 1
    var fRent = 70
    var sRent = 130
    var tRent = 220
    var foRent = 370
    var lRent = 750
}


class Szit {
    var alreadyBought: Boolean = false
    var naame = "Улица Житная"
    var colorCategoryDDDDD = "Коричневая"
    var fRent = 70
    var sRent = 130
    var tRent = 220
    var foRent = 370
    var lRent = 750
    var price = 60
    var rent = 70
    var rent_level = 1
}

class Ogarev {
    var alreadyBought: Boolean = false
    var naame = "Улица Огарево"
    var colorCategoryDDDDD = "Голубая"
    var fRent = 80
    var sRent = 140
    var tRent = 240
    var foRent = 410
    var lRent = 800
    var price = 100
    var rent = 80
    var rent_level = 1
}

class Pervpark {
    var alreadyBought: Boolean = false
    var naame = "Улица Первая парковая"
    var colorCategoryDDDDD = "Голубая"
    var fRent = 80
    var sRent = 140
    var tRent = 240
    var foRent = 410
    var lRent = 800
    var price = 100
    var rent = 80
    var rent_level = 1
}

class Pushkin {
    var alreadyBought: Boolean = false
    var naame = "Улица Пушкина"
    var colorCategoryDDDDD = "Красная"
    var fRent = 170
    var sRent = 250
    var tRent = 380
    var foRent = 580
    var lRent = 1160
    var price = 220
    var rent = 170
    var rent_level = 1
}

class Suseva {
    var alreadyBought: Boolean = false
    var naame = "Улица Щусева"
    var colorCategoryDDDDD = "Зеленая"
    var fRent = 230
    var sRent = 320
    var tRent = 460
    var foRent = 700
    var lRent = 1400
    var price = 300
    var rent = 230
    var rent_level = 1
}

class Ryazan {
    var alreadyBought: Boolean = false
    var naame = "Рязанский проспект"
    var colorCategoryDDDDD = "Оранжевая"
    var fRent = 140
    var sRent = 210
    var tRent = 330
    var foRent = 520
    var lRent = 1000
    var price = 180
    var rent = 140
    var rent_level = 1
}

class Sretenka {
    var alreadyBought: Boolean = false
    var naame = "Улица Сретенка"
    var colorCategoryDDDDD = "Розовая"
    var fRent = 110
    var sRent = 180
    var tRent = 290
    var foRent = 460
    var lRent = 900
    var price = 140
    var rent = 110
    var rent_level = 1
}

class Rublevka {
    var alreadyBought: Boolean = false
    var naame = "Рублевское шоссе"
    var colorCategoryDDDDD = "Оранжевая"
    var fRent = 160
    var sRent = 230
    var tRent = 350
    var foRent = 550
    var lRent = 1100
    var price = 200
    var rent = 160
    var rent_level = 1
}

class Kutuzov {
    var alreadyBought: Boolean = false
    var naame = "Кутузовский проспект"
    var colorCategoryDDDDD = "Зеленая"
    var fRent = 250
    var sRent = 340
    var tRent = 480
    var foRent = 730
    var lRent = 1440
    var price = 320
    var rent = 250
    var rent_level = 1
}

class Malenbron {
    var alreadyBought: Boolean = false

    var naame = "Улица Малая-бронная"
    var colorCategoryDDDDD = "Синяя"
    var fRent = 270
    var sRent = 360
    var tRent = 510
    var foRent = 740
    var lRent = 1500
    var price = 350
    var rent = 270
    var rent_level = 1

}

class Polyanka {
    var alreadyBought: Boolean = false
    var naame = "Улица Полянка"
    var colorCategoryDDDDD = "Розовая"
    var fRent = 110
    var sRent = 180
    var tRent = 290
    var foRent = 460
    var lRent = 900
    var price = 140
    var rent = 110
    var rent_level = 1
}

class Arbat {
    var alreadyBought: Boolean = false
    var naame = "Улица Арбат"
    var colorCategoryDDDDD = "Синяя"
    var fRent = 300
    var sRent = 400
    var tRent = 560
    var foRent = 810
    var lRent = 1600
    var price = 400
    var rent = 300
    var rent_level = 1
}

class Gogol {
    var alreadyBought: Boolean = false
    var naame = "Гоголевский бульвар"
    var colorCategoryDDDDD = "Зеленая"
    var fRent = 230
    var sRent = 320
    var tRent = 460
    var foRent = 700
    var lRent = 1440
    var price = 300
    var rent = 230
    var rent_level = 1
}

class Novinsk {
    var alreadyBought: Boolean = false
    var naame = "Новинский бульвар"
    var colorCategoryDDDDD = "Желтая"
    var fRent = 200
    var sRent = 280
    var tRent = 420
    var foRent = 640
    var lRent = 1300
    var price = 260
    var rent = 200
    var rent_level = 1
}

class Mayak {
    var alreadyBought: Boolean = false
    var naame = "Площадь Маяковского"
    var colorCategoryDDDDD = "Красная"
    var fRent = 190
    var sRent = 270
    var tRent = 400
    var foRent = 610
    var lRent = 1200
    var price = 240
    var rent = 190
    var rent_level = 1
}

class Vavilovo {
    var alreadyBought: Boolean = false
    var naame = "Улица Вавилово"
    var colorCategoryDDDDD = "Оранжевая"
    var fRent = 140
    var sRent = 210
    var tRent = 330
    var foRent = 520
    var lRent = 1000
    var price = 180
    var rent = 140
    var rent_level = 1
}

class Gruzin {
    var alreadyBought: Boolean = false
    var naame = "Грузинский Вал"
    var colorCategoryDDDDD = "Желтая"
    var fRent = 200
    var sRent = 280
    var tRent = 420
    var foRent = 640
    var lRent = 1300
    var price = 260
    var rent = 200
    var rent_level = 1
}

class Tversk {
    var alreadyBought: Boolean = false
    var naame = "Улица Тверская"
    var colorCategoryDDDDD = "Красная"
    var fRent = 170
    var sRent = 250
    var tRent = 380
    var foRent = 580
    var lRent = 1160
    var price = 220
    var rent = 170
    var rent_level = 1
}

class Chaik {
    var alreadyBought: Boolean = false
    var naame = "Улица Чаяковского"
    var colorCategoryDDDDD = "Желтая"
    var fRent = 120
    var sRent = 360
    var tRent = 850
    var foRent = 1025
    var lRent = 1200
    var price = 260
    var rent = 120
    var rent_level = 1
}

class Varshavsk {
    var alreadyBought: Boolean = false
    var naame = "Варшавское шоссе"
    var colorCategoryDDDDD = "Голубая"
    var fRent = 110
    var sRent = 180
    var tRent = 290
    var foRent = 460
    var lRent = 900
    var price = 60
    var rent = 120
    var rent_level = 1
}

class Rostov {
    var alreadyBought: Boolean = false
    var naame = "Ростовская набережная"
    var colorCategoryDDDDD = "Розовая"
    var fRent = 130
    var sRent = 200
    var tRent = 310
    var foRent = 490
    var lRent = 980
    var price = 160
    var rent = 130
    var rent_level = 1
}
class FRailStation{
    val price = 200
    val rent = 1
}
class SRailStation{
    val price = 200
    val rent = 1
}
class TRailStation{
    val price = 200
    val rent = 1
}class FoRailStation{
    val price = 200
    val rent = 1
}
class WaterStation{
    val price : Int = 1
    val rent : Int = 1
}
class LightStation{
    val price : Int = 1
    val rent : Int = 1
}