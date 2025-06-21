package com.gupta.android.phonepe.phonepe.components.banktransfer

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.gupta.android.phonepe.R
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.core.util.Consumer


@Preview
@Composable
fun SendMoneyIntro(){
    Column (
        modifier = Modifier.padding(top = 40.dp)
    ) {


        Row(
            modifier = Modifier.fillMaxWidth().padding(14.dp)
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
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 14.dp)
        ) {
            Text(text = "Send Money" , fontWeight = FontWeight.Bold, fontSize = 24.sp)
            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(R.drawable.green_bank),
                contentDescription = "green bank",
                modifier = Modifier.size(160.dp)
            )
        }
        TypeofBankPayment(image = R.drawable.phone_og, type = "To Self Bank Account" , savedaccounts = "1 Saved accounts")
        TypeofBankPayment(image = R.drawable.bank_transfer, type = "To Account Number & IFSC" , savedaccounts = "4 Saved accounts")
        TypeofBankPayment(image = R.drawable.announcement, type = "To Any UPI App" , savedaccounts = "2 saved UPI IDs / numbers")
    }
}



@Composable
fun TypeofBankPayment(
    image: Int,
    type : String,
    savedaccounts : String
){
    Column {
        Row (
            modifier = Modifier.padding(horizontal = 14.dp).padding(vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(image),
                contentDescription = "self payment",
                modifier = Modifier.size(60.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            ConstraintLayout {
                val (textColumn1, textColumn2) = createRefs()

                // Top text column
                Text(
                    text = type,
                    fontSize = 20.sp,
                    modifier = Modifier.constrainAs(textColumn1) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                )

                // Bottom text column
                Text(
                    text = savedaccounts,
                    fontSize = 10.sp,
                    modifier = Modifier.constrainAs(textColumn2) {
                        top.linkTo(textColumn1.bottom, margin = 8.dp)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                imageVector = Icons.Filled.KeyboardArrowUp,
                contentDescription = "arrow",
                modifier = Modifier.rotate(90f).size(30.dp)
            )
        }
    }
}