
(defproject clojure-automation-starter "0.1.0-SNAPSHOT"

  :description "An Automation Starter to validate Web Applications and Microservices"

  :url "http://example.com/FIXME"

  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/core.async "0.4.474"]
                 [etaoin/etaoin "0.3.6"]
                 [midje "1.6.3"]
                 [expectations/expectations "2.1.10"]
                 [env/faker "0.3.0"]
                 [org.clojure/tools.trace "0.7.10"]
                 [com.taoensso/timbre "4.10.0"]]

  :repl-options {:init-ns clojure-automation-starter.core})
