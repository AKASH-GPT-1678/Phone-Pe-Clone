package com.gupta.android.phonepe.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.gupta.android.phonepe.phonepe.components.FinanceOffers
import com.gupta.android.phonepe.phonepe.components.ManagePayments
import com.gupta.android.phonepe.phonepe.components.MoneyTransferSection
import com.gupta.android.phonepe.phonepe.components.RechargeandBill
import com.gupta.android.phonepe.phonepe.components.RewardsandEarnings
import com.gupta.android.phonepe.phonepe.components.ShareMarketAd
import com.gupta.android.phonepe.phonepe.components.SponsoredAd
import com.gupta.android.phonepe.phonepe.components.SponsoredLinks
import com.gupta.android.phonepe.phonepe.components.TicketHeader


@Composable
fun TestScreen() {
    LazyColumn {

        item {
            TicketHeader()
        }
        item {
            MoneyTransferSection()
        }

        item {
            RechargeandBill()
        }

        item {
            ShareMarketAd()
        }


        item {
            ManagePayments()
        }

        item {
            RewardsandEarnings()
        }
        item {
            SponsoredLinks()
        }

    }
}
