(defproject xyzzwhy/datastore "1.0.0-SNAPSHOT"
  :description "xyzzwhy's datastore wrapper for RethinkDB."
  :url "https://github.com/akivaschoen/xyzzwhy-datastore"
  :license {:name "GNU General Public License"
            :url "http://www.gnu.org/licenses/gpl.html"}

  :min-lein-version "2.6.1"

  :dependencies
  [[org.clojure/clojure "1.8.0"]
   [com.apa512/rethinkdb "0.15.12"]
   [environ "1.0.2"]
   [pluralex "1.0.0-SNAPSHOT"]]

  :plugins
  [[lein-autoexpect "1.7.0"]
   [lein-environ "1.0.1"]
   [lein-expectations "0.0.8"]]

  :profiles
  {:uberjar
   [:prod-config
    {:env {:production true}
     :omit-source true
     :aot :all}]

   :dev
   {:env {:dev true}
    :plugins []
    :dependencies [[expectations "2.1.4"]]}})

