(defproject com.vitalreactor/derive "0.1.0"
  :description "Simple library to support computing the 'latest' value derived from a mutable data source.  Designed to integrate into React/Om and with data stores like Datascript and NativeStore"
  :url "http://github.com/vitalreactor/derive"
  :license {:name "MIT License"
            :url "http://github.com/vitalreactor/derive/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2268"]
                 [prismatic/schema "0.2.2"]
                 [vitalreactor/om "0.6.3.1"]]
  :plugins [[lein-cljsbuild "1.0.3"]
            [com.cemerick/clojurescript.test "0.2.2"]]
  :source-paths ["src" "target/src"]
  :test-paths ["test" "target/test"]
  :cljsbuild {:repl-listen-port 9000
              :repl-launch-commands {"phantom" ["phantomjs" "phantom/page-repl.js"]}
              :builds [{:id "dev"
                        :source-paths ["src"]
                        :compiler {:output-to "target/js/derive.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}
                       {:id "prod"
                        :source-paths ["src"]
                        :compiler {:output-to "target/js/derive.min.js"
                                   :optimizations :advanced}}]}
  :hooks [leiningen.cljsbuild])
