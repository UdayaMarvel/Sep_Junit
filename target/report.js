$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Amazon.feature");
formatter.feature({
  "name": "Amazon Deals",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TodayDeals"
    }
  ]
});
formatter.background({
  "name": "Goto Todays Deals",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Goto Amazon \"https://www.amazon.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Todays_Deals.goto_amazon(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Amazon All Deals",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TodayDeals"
    },
    {
      "name": "@AllDeals"
    },
    {
      "name": "@out"
    }
  ]
});
formatter.step({
  "name": "Click on search field",
  "keyword": "When "
});
formatter.match({
  "location": "Todays_Deals.click_on_search_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for any product with one dim map",
  "rows": [
    {
      "cells": [
        "phone1",
        "nokia"
      ]
    },
    {
      "cells": [
        "phone2",
        "sony"
      ]
    },
    {
      "cells": [
        "phone3",
        "Iphone"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Todays_Deals.search_for_any_product_with_one_dim_map(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "List the Products displayed in the below grid",
  "keyword": "Then "
});
formatter.match({
  "location": "Todays_Deals.list_the_products_displayed_in_the_below_grid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on any product",
  "keyword": "When "
});
formatter.match({
  "location": "Todays_Deals.click_on_any_product()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
});