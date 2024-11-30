class PhotoshopKotlinPlugin {
    val processingEngine = ProcessingEngine(
        resolution = 8192,
        colorDepth = 32,
        formats = listOf("RAW", "PSD", "TIFF"),
        profiles = listOf("AdobeRGB", "ProPhotoRGB")
    )

    val templateEngine = TemplateEngine(
        templates = mapOf(
            "professional" to Template(
                dimensions = Pair(4096, 4096),
                dpi = 600,
                colorSpace = "ProPhotoRGB"
            ),
            "standard" to Template(
                dimensions = Pair(3508, 2480), 
                dpi = 300,
                colorSpace = "AdobeRGB"
            )
        )
    )

    val exportManager = ExportManager(
        settings = ExportSettings(
            batchEnabled = true,
            watermarkEnabled = true,
            metadataEnabled = true,
            compression = CompressionType.LOSSLESS
        )
    )
}
