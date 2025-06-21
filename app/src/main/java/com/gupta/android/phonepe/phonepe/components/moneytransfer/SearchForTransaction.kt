package com.gupta.android.phonepe.phonepe.components.moneytransfer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.gupta.android.phonepe.R
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.gupta.android.phonepe.ui.theme.Purple40
import java.nio.file.WatchEvent

@Preview
@Composable
fun SearchForPay(){
    var text by remember { mutableStateOf("") }


    Column {


        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp).padding(top = 50.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.backarrow_2),
                contentDescription = "back arrow",
                modifier = Modifier.size(20.dp),

                )
            Spacer(modifier = Modifier.width(4.dp))

            TextField(

                placeholder = { Text(text = "Search for Name or number") },
                onValueChange = { text = it },
                value = "",
                modifier = Modifier.fillMaxWidth()
            )

        }
        AllNumberDetails()


    }
}

@Composable
fun AllNumberDetails(){
    Row (
        modifier = Modifier.padding(horizontal = 32.dp, vertical = 20.dp).padding(top = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(R.drawable.dialpad),
            contentDescription = "dialpad",
            tint = Purple40,
            modifier = Modifier.size(35.dp)
        )

        Spacer(modifier = Modifier.width(15.dp))
        Text(text = "New Mobile Number", fontWeight = FontWeight.Bold, fontSize = 18.sp, color = Purple40)
    }

}