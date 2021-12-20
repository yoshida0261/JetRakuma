package com.stah.jetrakuma.ui.nav


enum class HomeTabNavigation(val display : String)
{
    Recommend(display = "おすすめ"),
    Public(display = "公式");

    companion object {
        fun fromRoute(route: String?): HomeTabNavigation =
            when (route?.substringBefore("/")) {
                Recommend.display -> Recommend
                Public.display -> Public
                else -> Recommend
            }
    }
}

enum class NotificationNavigation(val display : String)
{
    You(display = "あなた"),
    Deal(display = "取引"),
    Rakuma(display = "ラクマ");

    companion object {
        fun fromRoute(route: String?): NotificationNavigation =
            when (route?.substringBefore("/")) {
                You.display -> You
                Deal.display -> Deal
                Rakuma.display -> Rakuma
                else -> You
            }
    }
}
