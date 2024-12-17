package id.ac.polbeng.riskiafendi.githubprofile2.helpers

import id.ac.polbeng.riskiafendi.githubprofile2.BuildConfig


class Config {
    companion object {

        val PERSONAL_ACCESS_TOKEN = "token ${BuildConfig.ACCESS_TOKEN}"

        const val SPLASH_SCREEN_DELAY: Long = 3000
        const val BASE_URL = "https://api.github.com"
        const val DEFAULT_USER_LOGIN = "MalaikatIsrafil"

    }
}