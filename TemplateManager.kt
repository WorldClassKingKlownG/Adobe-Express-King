class TemplateManager {
    private val templates = mutableMapOf<String, Template>()

    fun addTemplate(name: String, template: Template) {
        templates[name] = template
    }

    fun getTemplate(name: String): Template? = templates[name]
}
