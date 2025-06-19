package com.gupta.android.phonepe.phonepe.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gupta.android.phonepe.R

@Preview
@Composable
fun ManagePayments() {
    Surface(
        modifier = Modifier
            .background(color = Color(0x80EBEDEF))
            .padding(12.dp),
        color = Color(0x80EBEDEF),
        shape = RoundedCornerShape(10.dp),
    ) {
        Column {
            Row(
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Manage Payments", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(text = "View All")
            }

            Spacer(modifier = Modifier.padding(8.dp))

            Row(
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                PaymentTabs(imageResId = R.drawable.wallet, label = "Wallet")
                PaymentTabs(imageResId = R.drawable.lightning, label = "UPI Lite")
                PaymentTabs(imageResId = R.drawable.circle, label = "UPI Circle")
                PaymentTabs(imageResId = R.drawable.card, label = "Credit Card")
            }
        }
    }
}

@Composable
fun PaymentTabs(
    imageResId: Int,
    label: String,
    circleSize: Dp = 70.dp,
    paddingInside: Dp = 16.dp,

){

        Column(

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                modifier = Modifier.size(circleSize),
                shape = CircleShape,
                color = Color.White

            ) {
                Image(
                    painter = painterResource(imageResId),
                    contentDescription = label,
                    modifier = Modifier.padding(paddingInside)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(text = label , fontSize = 18.sp)
        }
    }

