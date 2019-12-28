$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchCars.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate search car is working fine.",
  "description": "In order to validate that\nthe search cars page is working fine\nwe will do the accpetance testing.",
  "id": "acceptance-testing-to-validate-search-car-is-working-fine.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 3832221373,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-car-is-working-fine.;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the homepage \"https://www.carsguide.com.au/\" of carsguide website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I move to menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 11
    },
    {
      "cells": [
        "buy+sell"
      ],
      "line": 12
    },
    {
      "cells": [
        "review"
      ],
      "line": 13
    },
    {
      "cells": [
        "news"
      ],
      "line": 14
    },
    {
      "cells": [
        "advice"
      ],
      "line": 15
    },
    {
      "cells": [
        "pricing+specs"
      ],
      "line": 16
    },
    {
      "cells": [
        "labs"
      ],
      "line": 17
    },
    {
      "cells": [
        "guides"
      ],
      "line": 18
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select carbrand as \"BMW\" from any make dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "select carmodel as \"1 Series\" from selectmodel dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "select location as \"Any Location\" from selectlocation dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "select price as \"$1,000\" from price dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I should see the list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "the page title should be \"Bmw 1 Series Under 1000 for Sale | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 22
    }
  ],
  "location": "SearchCarsSteps.i_am_on_the_homepage_of_carsguide_website(String)"
});
formatter.result({
  "duration": 10514793725,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.i_move_to_menu(String\u003e)"
});
formatter.result({
  "duration": 142249607,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 10
    }
  ],
  "location": "SearchCarsSteps.click_on_link(String)"
});
formatter.result({
  "duration": 13632457152,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 20
    }
  ],
  "location": "SearchCarsSteps.select_carbrand_as_from_any_make_dropdown(String)"
});
formatter.result({
  "duration": 104704367,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 20
    }
  ],
  "location": "SearchCarsSteps.select_carmodel_as_from_selectmodel_dropdown(String)"
});
formatter.result({
  "duration": 439607245,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Any Location",
      "offset": 20
    }
  ],
  "location": "SearchCarsSteps.select_location_as_from_selectlocation_dropdown(String)"
});
formatter.result({
  "duration": 65956576,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,000",
      "offset": 17
    }
  ],
  "location": "SearchCarsSteps.select_price_as_from_price_dropdown(String)"
});
formatter.result({
  "duration": 106996770,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 8836982412,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.i_should_see_the_list_of_searched_cars()"
});
formatter.result({
  "duration": 47305,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 1000 for Sale | carsguide",
      "offset": 26
    }
  ],
  "location": "SearchCarsSteps.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 7030254,
  "status": "passed"
});
formatter.after({
  "duration": 2855726511,
  "status": "passed"
});
formatter.uri("UsedCarsSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate used search car is working fine.",
  "description": "In order to validate that\r\nthe used search cars page is working fine\r\nwe will do the accpetance testing.",
  "id": "acceptance-testing-to-validate-used-search-car-is-working-fine.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Used-Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 3487532070,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate used Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-used-search-car-is-working-fine.;validate-used-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Used-Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the homepage \"https://www.carsguide.com.au/\" of carsguide website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I move to menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 11
    },
    {
      "cells": [
        "buy+sell"
      ],
      "line": 12
    },
    {
      "cells": [
        "review"
      ],
      "line": 13
    },
    {
      "cells": [
        "news"
      ],
      "line": 14
    },
    {
      "cells": [
        "advice"
      ],
      "line": 15
    },
    {
      "cells": [
        "pricing+specs"
      ],
      "line": 16
    },
    {
      "cells": [
        "labs"
      ],
      "line": 17
    },
    {
      "cells": [
        "guides"
      ],
      "line": 18
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "click in \"Used\" search car link",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select carbrand as \"Audi\" from any make dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "select car model",
  "rows": [
    {
      "cells": [
        "carModel"
      ],
      "line": 22
    },
    {
      "cells": [
        "A4"
      ],
      "line": 23
    },
    {
      "cells": [
        "A3"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "select location as \"NSW - All\" from selectlocation dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "select price as \"$2,500\" from price dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I should see the list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "the page title should be \"Used Audi A4 Under 2500 for Sale NSW | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 22
    }
  ],
  "location": "SearchCarsSteps.i_am_on_the_homepage_of_carsguide_website(String)"
});
formatter.result({
  "duration": 7747781335,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.i_move_to_menu(String\u003e)"
});
formatter.result({
  "duration": 201023350,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used",
      "offset": 10
    }
  ],
  "location": "UsedCarsStep.click_in_search_car_link(String)"
});
formatter.result({
  "duration": 4585703341,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Audi",
      "offset": 20
    }
  ],
  "location": "SearchCarsSteps.select_carbrand_as_from_any_make_dropdown(String)"
});
formatter.result({
  "duration": 144743286,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarsStep.select_car_model(String\u003e)"
});
formatter.result({
  "duration": 326115408,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NSW - All",
      "offset": 20
    }
  ],
  "location": "SearchCarsSteps.select_location_as_from_selectlocation_dropdown(String)"
});
formatter.result({
  "duration": 99851965,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$2,500",
      "offset": 17
    }
  ],
  "location": "SearchCarsSteps.select_price_as_from_price_dropdown(String)"
});
formatter.result({
  "duration": 96436780,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 7044945581,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.i_should_see_the_list_of_searched_cars()"
});
formatter.result({
  "duration": 36637,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used Audi A4 Under 2500 for Sale NSW | carsguide",
      "offset": 26
    }
  ],
  "location": "SearchCarsSteps.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 5350952,
  "status": "passed"
});
formatter.after({
  "duration": 2817180459,
  "status": "passed"
});
});