package terapps.factoryplanner.api.configurations.dto

import org.springframework.boot.context.properties.ConfigurationProperties

data class BucketConfig(
        val accessKey: String,
        val secretKey: String,
        val bucket: String,
)

@ConfigurationProperties("factoryplanner.filestorage")
data class FileStorageConfig(
        val url: String,
        val assets: BucketConfig,
        val resources: BucketConfig,
)