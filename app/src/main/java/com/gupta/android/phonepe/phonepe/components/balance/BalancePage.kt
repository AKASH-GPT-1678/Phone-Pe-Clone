package com.gupta.android.phonepe.phonepe.components.balance

import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gupta.android.phonepe.R
import com.gupta.android.phonepe.ui.theme.DarkPurple
import com.gupta.android.phonepe.ui.theme.Purple80


@Preview
@Composable
fun BalancePage(){
    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(12.dp).padding(top = 28.dp)
            .fillMaxWidth()
    ){

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                painter = painterResource(R.drawable.backarrow_2),
                contentDescription = "back arrow",
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(R.drawable.que_mark),
                contentDescription = "question mark",
                modifier = Modifier.size(30.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))


        Text(text = "Check Balance" , fontWeight = FontWeight.Bold, fontSize = 28.sp)


        Spacer(modifier = Modifier.height(40.dp))

        Text(text = "ACCOUNTS ON UPI" , fontSize = 18.sp , color = Color.Gray, modifier = Modifier.padding(start = 4.dp))


        AccountsonUPI()

        HorizontalDivider()

        PrepaidPart()

        BottonAd()


    }}



@Composable
fun AccountsonUPI(){
    Box(modifier = Modifier.padding(horizontal = 8.dp , vertical = 20.dp)){
        Row (
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                painter = painterResource(R.drawable.upi),
                contentDescription = "upi icon",
                tint = DarkPurple
            )

            Spacer(modifier = Modifier.width(20.dp))

            Text(text = "Canara Bank 7120" , fontSize = 18.sp)

            Spacer(modifier = Modifier.weight(1f))

            Icon(
                painter = painterResource(R.drawable.right_arrow),
                contentDescription = "right arrow"
                ,
                modifier = Modifier.rotate(180f).size(26.dp)
            )
        }
    }
}

@Composable
fun PrepaidPart(){
    Column(
        modifier = Modifier.padding(vertical = 20.dp , horizontal = 8.dp)
    ) {
        Text(text = "PRE PAID BALANCE" , fontSize = 18.sp , color = Color.Gray, modifier = Modifier.padding(start = 4.dp))
        Spacer(modifier = Modifier.height(20.dp))

        AccountsonUPI()
        AccountsonUPI()


    }
}

@Composable
fun BottonAd(){
    androidx.compose.foundation.Image(
        painter = painterResource(R.drawable.colgate_ad
        ),
        contentDescription = "add",
        modifier = Modifier.fillMaxWidth()
    )
}