package com.gupta.android.phonepe.phonepe.components.banktransfer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gupta.android.phonepe.R
import com.gupta.android.phonepe.phonepe.components.moneytransfer.SearchSectiontransfer


@Preview
@Composable
fun BankTransfers() {

    Column {

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

        SearchSectiontransfer(placeholder = "Search saved UPI ID/Number", onSearchClick = {})

        Row(modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.weight(1f).padding(18.dp), contentAlignment = Alignment.Center) {
                Text(text = "UPI ID", fontWeight = FontWeight.ExtraBold,  modifier = Modifier.padding(bottom = 10.dp))
            }
            Box(modifier = Modifier.weight(1f).padding(18.dp), contentAlignment = Alignment.Center) {
                Text(text = "UPI Number", fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(bottom = 10.dp))
            }
        }

    }
}