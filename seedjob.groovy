folder('MainSeedJobFolder') {
    freeStyleJob('MainSeedJobFolder/mainJobDSl') {
        scm {
            git {
                branch('main')
                remote {
                    url('https://github.com/sagarkalankar1/Assignment7a_Jenkins.git')
                }
            }
        }
        steps {
            dsl {
                external('JobDSL/*/folder.jenkins')
                external('JobDSL/**/*_job.jenkins')
            }
        }
    }
}
