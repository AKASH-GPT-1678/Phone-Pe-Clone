package com.gupta.android.phonepe.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.gupta.android.phonepe.phonepe.components.FinanceOffers
import com.gupta.android.phonepe.phonepe.components.ManagePayments
import com.gupta.android.phonepe.phonepe.components.MoneyTransferSection
import com.gupta.android.phonepe.phonepe.components.RechargeandBill
import com.gupta.android.phonepe.phonepe.components.RewardsandEarnings
import com.gupta.android.phonepe.phonepe.components.ShareMarketAd
import com.gupta.android.phonepe.phonepe.components.SponsoredLinks
import com.gupta.android.phonepe.phonepe.components.TicketHeader


@Composable
fun HomeScreen(
    navController: NavController,
    onMoneyCLick : () -> Unit,
    onBanktransferClick : () -> Unit,
    onReferandEarn : ()-> Unit

){


    LazyColumn {
        item {
            TicketHeader()
        }
        item {
            MoneyTransferSection( onMoneytransfer = onMoneyCLick , onBanktransfer = onBanktransferClick, onReferEarn = onReferandEarn )
        }
        item {
            FinanceOffers()
        }
         item {
             ManagePayments()
         }
        item {
            RewardsandEarnings()
        }
        item {
            ShareMarketAd()
        }
        item {
            SponsoredLinks()
        }


    }

}