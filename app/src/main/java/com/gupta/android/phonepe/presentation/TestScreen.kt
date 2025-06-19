package com.gupta.android.phonepe.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.gupta.android.phonepe.phonepe.components.FinanceOffers
import com.gupta.android.phonepe.phonepe.components.RechargeandBill
import com.gupta.android.phonepe.phonepe.components.TicketHeader


@Composable
fun TestScreen(){

    Column {

        TicketHeader()
        RechargeandBill()

        FinanceOffers()

    }

}