package com.geektech.builder

class SettingsBuilder {
    private var graphics: String = "Low"
    private var sensitivity: Int = 2000
    private var latency: Int = 200

    fun setGraphics(value: String): SettingsBuilder {
        this.graphics = value
        return this
    }

    fun setSensitivity(value: Int): SettingsBuilder {
        this.sensitivity = value
        return this
    }

    fun setLatency(value: Int): SettingsBuilder {
        this.latency = value
        return this
    }

    fun build(): Settings {
        return Settings(
            graphics = graphics,
            sensitivity = sensitivity,
            latency = latency
        )
    }
}

