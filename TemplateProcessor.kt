class TemplateProcessor {
    private val settings = ProcessingSettings(
        maxResolution = 8192,
        colorDepth = 32,
        compression = "lossless",
        quality = 100
    )

    fun processTemplate(template: Template) {
        template.apply {
            validateDimensions()
            optimizeResolution()
            prepareExport()
        }
    }
}
