(ns {{name}}.web_unit
  (:use [{{name}}.web]
        [clojure.test]
        [midje.sweet]))

(defn request [method resource]
  (routes {:request-method method
           :uri resource } ))

(deftest ^:unit tests
  (fact "Ping returns a pong"
        (:body (request :get "/1.x/ping"))  => "pong" )
)
