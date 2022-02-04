@BeforeStep
void before(){
    println "Splunk: running before the ${hookContext.library} library's ${hookContext.step} step"
}

//@AfterStep
//@AfterStep({ hookContext.step.equals("static_code_analysis") })
@AfterStep({ hookContext.step in config.afterSteps })
void after(){
    println "Splunk: running after the ${hookContext.library} library's ${hookContext.step} step"
}