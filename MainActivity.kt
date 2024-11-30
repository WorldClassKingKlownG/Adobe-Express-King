class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUI()
        initializeProcessing()
    }
    
    private fun setupUI() {
        binding.apply {
            processButton.setOnClickListener { processImage() }
            exportButton.setOnClickListener { exportResult() }
            templateSpinner.adapter = TemplateAdapter(templates)
        }
    }
}
