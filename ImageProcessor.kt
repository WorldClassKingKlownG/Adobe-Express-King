class ImageProcessor {
    fun process(image: PhotoshopImage): ProcessedImage {
        return ProcessingPipeline()
            .addStep(::standardize)
            .addStep(::enhance)
            .addStep(::optimize)
            .addStep(::prepare)
            .execute(image)
    }
}
