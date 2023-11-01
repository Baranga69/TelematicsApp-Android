object AppConfig {
    const val applicationIdPrefix = "com.test"
    private const val name = "telemati"

    const val applicationId = "$applicationIdPrefix.$name"

    const val versionName = "1.0.0"
    const val versionCode = 1

    const val SOURCE = "\"Zenroad\""

    const val PRIVACY_POLICY = "\"YOUR_PRIVACY_POLICY_LINK\"" //for example "\"https://www.telematicssdk.com/privacy-policy/\""
    const val TERMS_OF_USE = "\"YOUR_TERMS_OF_USE_LINK\"" //for example"\"https://www.telematicssdk.com/privacy-policy/\""

    const val DASHBOARD_DISTANCE_LIMIT = "10" //in km

    const val INSTANCE_ID = "\"5398f71a-a74f-4cff-a44c-74cdc9178f0a\""
    const val INSTANCE_KEY = "\"e5106118-a18f-4cc6-82ff-c0d411ade22f\""

    const val GOOGLE_MAP_API = "AIzaSyB2JKuXk1J61r_InABhYYhpOvkFMqzgdK4"

    // Needs request notification permission(Android 13+)
    const val REQUEST_NOTIFICATION_PERMISSION = "false"

    const val USER_SERVICE_URL = "\"https://user.telematicssdk.com/\""
    const val USER_SERVICE_URL_DEV = "\"https://user.telematicssdk.com/\""

    const val DRIVE_COINS_URL = "\"https://mobilesdk.telematicssdk.com/api/rewarding/\""
    const val DRIVE_COINS_URL_DEV = "\"https://mobilesdk.telematicssdk.com/api/rewarding/\""

    const val USER_STATISTICS = "\"https://api.telematicssdk.com/\""
    const val USER_STATISTICS_DEV = "\"https://api.telematicssdk.com/\""

    const val LEADERBOARD_URL = "\"http://leaderboard.telematicssdk.com/\""
    const val LEADERBOARD_URL_DEV = "\"http://leaderboard.telematicssdk.com/\""

    const val TRIP_EVENT_TYPE_URL = "\"https://mobilesdk.telematicssdk.com/mobilesdk/stage/\""
    const val TRIP_EVENT_TYPE_URL_DEV = "\"https://mobilesdk.telematicssdk.com/mobilesdk/stage/\""

    const val OBD_API_ENDPOINT = "\"https://services.telematicssdk.com/api/carservice/\""
    const val OBD_API_ENDPOINT_DEV = "\"https://services.telematicssdk.com/api/carservice/\""
}