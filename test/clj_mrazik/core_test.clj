;
;  (C) Copyright 2016  Pavel Tisnovsky
;
;  All rights reserved. This program and the accompanying materials
;  are made available under the terms of the Eclipse Public License v1.0
;  which accompanies this distribution, and is available at
;  http://www.eclipse.org/legal/epl-v10.html
;
;  Contributors:
;      Pavel Tisnovsky
;

(ns clj-mrazik.core-test
  (:require [clojure.test :refer :all]
            [clj-mrazik.core :refer :all]))

;
; Common functions used by tests.
;

(defn callable?
    "Test if given function-name is bound to the real function."
    [function-name]
    (clojure.test/function? function-name))


(deftest test-between?-existence
    "Check that the clj-mrazik.core/between? definition exists."
    (testing "if the clj-mrazik.core/between? definition exists."
        (is (callable? 'clj-mrazik.core/between?))))


(deftest test-in-schedule?-existence
    "Check that the clj-mrazik.core/in-schedule? definition exists."
    (testing "if the clj-mrazik.core/in-schedule? definition exists."
        (is (callable? 'clj-mrazik.core/in-schedule?))))


(deftest test-open-window-existence
    "Check that the clj-mrazik.core/open-window definition exists."
    (testing "if the clj-mrazik.core/open-window definition exists."
        (is (callable? 'clj-mrazik.core/open-window))))


(deftest test-close-window-existence
    "Check that the clj-mrazik.core/close-window definition exists."
    (testing "if the clj-mrazik.core/close-window definition exists."
        (is (callable? 'clj-mrazik.core/close-window))))


(deftest test-sunrise-existence
    "Check that the clj-mrazik.core/sunrise definition exists."
    (testing "if the clj-mrazik.core/sunrise definition exists."
        (is (callable? 'clj-mrazik.core/sunrise))))


(deftest test-sunset-existence
    "Check that the clj-mrazik.core/sunset definition exists."
    (testing "if the clj-mrazik.core/sunset definition exists."
        (is (callable? 'clj-mrazik.core/sunset))))


(deftest test-is-sunrise?-existence
    "Check that the clj-mrazik.core/is-sunrise? definition exists."
    (testing "if the clj-mrazik.core/is-sunrise? definition exists."
        (is (callable? 'clj-mrazik.core/is-sunrise?))))


(deftest test-is-sunset?-existence
    "Check that the clj-mrazik.core/is-sunset? definition exists."
    (testing "if the clj-mrazik.core/is-sunset? definition exists."
        (is (callable? 'clj-mrazik.core/is-sunset?))))


(deftest test-run-bot-existence
    "Check that the clj-mrazik.core/run-bot definition exists."
    (testing "if the clj-mrazik.core/run-bot definition exists."
        (is (callable? 'clj-mrazik.core/run-bot))))


(deftest test-start-bot-existence
    "Check that the clj-mrazik.core/start-bot definition exists."
    (testing "if the clj-mrazik.core/start-bot definition exists."
        (is (callable? 'clj-mrazik.core/start-bot))))


(deftest test-show-help-existence
    "Check that the clj-mrazik.core/show-help definition exists."
    (testing "if the clj-mrazik.core/show-help definition exists."
        (is (callable? 'clj-mrazik.core/show-help))))


(deftest test--main-existence
    "Check that the clj-mrazik.core/-main definition exists."
    (testing "if the clj-mrazik.core/-main definition exists."
        (is (callable? 'clj-mrazik.core/-main))))


