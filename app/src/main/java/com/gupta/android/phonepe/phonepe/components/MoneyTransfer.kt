package com.gupta.android.phonepe.phonepe.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gupta.android.phonepe.R
import java.nio.file.WatchEvent

@Composable
fun MoneyTransferSection(){
    Column (
        modifier = Modifier.padding(horizontal = 20.dp , vertical = 10.dp)
    ) {

        Text(text = "Money Transfers" , fontWeight = FontWeight.Bold , fontSize = 20.sp)

        Row (
            modifier = Modifier.padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            val imagePainter = painterResource(id = R.drawable.phone_og)


            Service(image =R.drawable.phone_money, text1 = "Check" , text2 = "Balance")
            Service(image =R.drawable.bank_transfer, text1 = "Check" , text2 = "Balance")
            Service(image =R.drawable.announcement, text1 = "Check" , text2 = "Balance")
            Service(image = R.drawable.balance, text1 = "Check" , text2 = "Balance")



        }

    }
}


@Composable
fun Service(
    image: Int,
    text1: String,
    text2: String
){

    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){


        Surface {
            Image(
                painter = painterResource(image),
                contentDescription = "label",
                modifier = Modifier.padding(10.dp)
            )
        }
        Text(text = text1)
        Text(text = text2)
    }



}

@Preview
@Composable
fun PreviewSection(){
    MoneyTransferSection()
}