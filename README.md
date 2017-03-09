# Simple scrapper to easily add people to Slack channel using GAE for App Engine Flexible environment

## Requirements
* [Apache Maven](http://maven.apache.org) 3.3.9 or greater
* [Google Cloud SDK](https://cloud.google.com/sdk/)
* `gcloud components install app-engine-java`
* `gcloud components update`

## Setup

Use either:

* `gcloud init`
* `gcloud auth application-default login`

We support building with [Maven](http://maven.apache.org/), [Gradle](https://gradle.org), and [IntelliJ IDEA](https://cloud.google.com/tools/intellij/docs/).
The samples have files to support both Maven and Gradle.  To use the IDE plugins, see the documentation pages above.

## Gradle
[Using Gradle and the App Engine Plugin](https://cloud.google.com/appengine/docs/flexible/java/using-gradle) 
& [Gradle Tasks and Parameters](https://cloud.google.com/appengine/docs/flexible/java/gradle-reference)
### Running locally

    $ gradle jettyRun

### Deploying

    $ gcloud config set project vigojug-slack-inviter
    $ gradle appengineDeploy

