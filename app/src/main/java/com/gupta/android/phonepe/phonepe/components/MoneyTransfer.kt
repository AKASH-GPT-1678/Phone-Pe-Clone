package com.gupta.android.phonepe.phonepe.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gupta.android.phonepe.R
import com.gupta.android.phonepe.phonepe.components.moneytransfer.MoneyTransferByNumber
import com.gupta.android.phonepe.phonepe.components.moneytransfer.NavigationMoney
import java.nio.file.WatchEvent

@Composable
fun MoneyTransferSection(
    onMoneytransfer: () -> Unit,
    onBanktransfer: ()-> Unit,
    onReferEarn: ()-> Unit

){
    val navController = rememberNavController()
    Column (
        modifier = Modifier.padding(horizontal = 20.dp , vertical = 10.dp)
    ) {

        Text(text = "Money Transfers" , fontWeight = FontWeight.Bold , fontSize = 20.sp)

        Row (

            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            val imagePainter = painterResource(id = R.drawable.phone_og)



            Service(image =R.drawable.phone_money, text1 = "To Mobile" , text2 = "Numbers", onImageClick = onMoneytransfer)
            Service(image =R.drawable.bank_transfer, text1 = "To Bank &" , text2 = "Selft A/c", onImageClick = onBanktransfer)
            Service(image =R.drawable.announcement, text1 = "Refer & Get" , text2 = "Upto 200", onImageClick = onReferEarn)



        }

    }
}


@Composable
fun Service(
    image: Int,
    text1: String,
    text2: String,
    onImageClick : ()-> Unit
){

    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){


        Surface {
            Image(
                painter = painterResource(image),
                contentDescription = "label",
                modifier = Modifier.padding(10.dp)
                    .size(64.dp)
                    .clickable(onClick = onImageClick)
            )
        }
        Text(text = text1)
        Text(text = text2)
    }



}

@Preview
@Composable
fun PreviewSection(){

}