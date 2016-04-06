#Hottel version 1.0 - Customer site

How To Run :

    1. Install nodejs exe
    2. Navigate to the hotel_v1.0_master using command prompt
    3. Type npm install (NPM dependent modules will be downloaded)
    4. Navigate to customer_site folder in cmd
    5. Run node server.js
    6. Open http://localhost/#/login link in browser

App structure :

    SPA (Single Page Application):

    Customer_site |
                  |Index.html - Base html file - Version (HTML 5)
                  |Scripts |
                           | Controllers - AngularJs MVC, Controllers
                           | Directives - AngularJs MVC, Custom HTML Tags
                           | Service - AngularJs MVC, Model
                           | Vendors |
                                     | AngularJs (Application MVC Framework)- v1.4.0-rc.2
                                     | Bootstrap (Application custom UI) - v3.3.4
                                     | Jquery (Javascript UI Library) - v2.1.3
                                     | Require (Javascript AMD) - v2.1.15
                           | app.js - Angular app configuration using require module
                           | ng_require_config.js - Application require configuration
                           | routs.js - RequireJs routes
                  | Styles |
                           | css |
                                 | bootstrap v3.3.2 - UI Framework
                           | less
                  | server.js - Node server




ToDo :

    1. Less and CSS Lazy loading configuration
    2. Auth0 implementation
    3. ng-Resource configuration
    4. Fonts, Icons and Images
