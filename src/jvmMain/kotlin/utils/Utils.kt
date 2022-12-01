package utils

import java.util.*
import java.util.concurrent.ScheduledThreadPoolExecutor
import java.util.concurrent.TimeUnit
import kotlin.concurrent.schedule

object Utils {
    fun after(delay: Long, unit: () -> Unit) {
        Timer().schedule(delay) {
            unit()
        }
    }

    fun every(delay: Long, unit: () -> Unit) {
        val executor = ScheduledThreadPoolExecutor(1)
        executor.scheduleWithFixedDelay({
            unit()
        }, delay, delay, TimeUnit.MILLISECONDS)
    }
}
