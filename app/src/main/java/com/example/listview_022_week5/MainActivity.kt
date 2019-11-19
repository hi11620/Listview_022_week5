package com.example.listview_022_week5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val titleArr = arrayOf(
        "1.Anostail",
        "2.Abandon",
        "3.Abyss Guard",
        "4.Abyssal Mask",
        "5.Achu Rinbon",
        "6.Adel Mask",
        "7.Adel Mask I",
        "8.Adel Mask II",
        "9.Adventurer Big Shield",
        "10.Aerugo Green Mask",
        "11.Aldoor",
        "12.Alen's Hat",
        "13.Almas Brimas",
        "14.Altorm",
        "15.Altorm I",
        "16.Altorm II",
        "16.amber crowns",
        "18.Amerityara",
        "19.Amrivelt",
        "20.Ancient Helmet"
        )
    val detailArr = arrayOf(
        "ATK: 20 DEF: 20",
        "ATK&MATK-5%, MP cost -20% Hate rise -50%",
        "Critical damage +7% Dark R +5%",
        "All stats -5, MaxHP-4% ATK+9% Skill delay -0.2sec Critical damage +9%",
        "INT+2 VIT+2, Magic R +5% MaxHP up by INT, down by VIT.",
        "Autoskill+2% INT&VIT+3, Magic R +8% MaxHP up by INT, down by VIT.",
        "INT+7 VIT+7, Magic R +9% MaxHP up by INT, down by VIT Autoskill+5%",
        "DEF: 15",
        "VIT+5, Ailment R +20% Water&Wind R +5%",
        "Reflect+5% ATK up chance by attack Effect up as HP becomes lower.",
        "EP2 commemoration item Small MP recovery chance All stats +1",
        "Stats up with Staffs MATK+7% A. eva +10%, Dark R +5%, C. def -50% Magic R +6%, All magic +7%",
        "VIT+10 STR+7 CRT+3",
        "VIT+20 STR+14 CRT+6 Melee R +8%, Magic R +8%",
        "VIT +25 STR +25 CRT +25 Melee R +12% Magic R +12% Neutral R +10%",
        "Water R +5% Wind R +5% Earth R +5% Auto HP Recovery +30% Auto MP Recovery +30% MATK +8% If [DEX > 300] then Skill Delay -1.5s",
        "Water Magic +15% Range cut +12% MATK +10% Paralysis -1.2s MP Cost +30% Autoskill Magic to boss +2% MP Cost -50%",
        "EP4 Celebration Gift All stats+1 Absolute&Magic evasion+3% HP recovery chance by attack STR +1 AGI +1 VIT +1 INT +1 DEX +1 CRT +1 Absolute Evasion +3% Magic Evasion +3% Autoskill Notes: Trade × Slot: 1",
        "DEF: 8",
        "MATK+7% MaxHP+700 Evasion+13%"
        )
    val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("ข้อมูลไอเทม")


        val mAdapter = ArrayAdapter(context,android.R.layout.simple_list_item_1,titleArr)

        lv_province.adapter = mAdapter

        lv_province.setOnItemClickListener{parent,view,position,id ->

            Toast.makeText(context,
                "ชื่อ = ${titleArr[position]} " + "ออฟชั่น = ${detailArr[position]}"
                ,Toast.LENGTH_LONG).show()
        }
    }
}
