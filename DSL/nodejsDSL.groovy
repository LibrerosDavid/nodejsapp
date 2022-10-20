job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/LibrerosDavid/nodejsapp.git', 'master') { node ->
		node / gitConfigName('LibrerosDavid')
		node / gitConfigEmail('j.d.libreroslopez@gmail.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('Nodejs')
    }
    steps {
        shell("npm install")
    }
}
