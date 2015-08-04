/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package griffon.plugins.devicons;

import javax.annotation.Nonnull;

import static griffon.util.GriffonNameUtils.requireNonBlank;

/**
 * @author Andres Almiray
 */
public enum DevIconFont {
    // latest is e6c5
    ANDROID("android", '\ue60e'),
    ANGULAR("angular", '\ue653'),
    APPCELERATOR("appcelerator", '\ue6ab'),
    APPLE("apple", '\ue611'),
    APPSTORE("appstore", '\ue613'),
    APTANA("aptana", '\ue699'),
    ASTERISK("asterisk", '\ue6ac'),
    ATLASSIAN("atlassian", '\ue65b'),
    ATOM("atom", '\ue664'),
    AWS("aws", '\ue6ad'),
    BACKBONE("backbone", '\ue652'),
    BING_SMALL("bing_small", '\ue600'),
    BINTRAY("bintray", '\ue694'),
    BITBUCKET("bitbucket", '\ue603'),
    BLACKBERRY("blackberry", '\ue623'),
    BOOTSTRAP("bootstrap", '\ue647'),
    BOWER("bower", '\ue64d'),
    BRACKETS("brackets", '\ue69d'),
    BUGSENSE("bugsense", '\ue68d'),
    CELLULOID("celluloid", '\ue66b'),
    CHROME("chrome", '\ue643'),
    CISCO("cisco", '\ue665'),
    CLOJURE("clojure", '\ue668'),
    CLOJURE_ALT("clojure_alt", '\ue66a'),
    CLOUD9("cloud9", '\ue69f'),
    CODA("coda", '\ue693'),
    CODE("code", '\ue696'),
    CODEIGNITER("codeigniter", '\ue680'),
    CODEPEN("codepen", '\ue616'),
    CODE_BADGE("code_badge", '\ue6a3'),
    CODROPS("codrops", '\ue62f'),
    COFFEESCRIPT("coffeescript", '\ue651'),
    COMPASS("compass", '\ue661'),
    COMPOSER("composer", '\ue683'),
    CREATIVECOMMONS("creativecommons", '\ue689'),
    CREATIVECOMMONS_BADGE("creativecommons_badge", '\ue68a'),
    CSS3("css3", '\ue649'),
    CSS3_FULL("css3_full", '\ue64a'),
    CSSDECK("cssdeck", '\ue62a'),
    CSS_TRICKS("css_tricks", '\ue601'),
    DART("dart", '\ue698'),
    DATABASE("database", '\ue606'),
    DEBIAN("debian", '\ue67d'),
    DIGITAL_OCEAN("digital-ocean", '\ue6ae'),
    DJANGO("django", '\ue61d'),
    DLANG("dlang", '\ue6af'),
    DOCKER("docker", '\ue6b0'),
    DOCTRINE("doctrine", '\ue674'),
    DOJO("dojo", '\ue61c'),
    DOTNET("dotnet", '\ue67f'),
    DREAMWEAVER("dreamweaver", '\ue69c'),
    DROPBOX("dropbox", '\ue607'),
    DRUPAL("drupal", '\ue642'),
    ECLIPSE("eclipse", '\ue69e'),
    EMBER("ember", '\ue61b'),
    ENVATO("envato", '\ue65d'),
    ERLANG("erlang", '\ue6b1'),
    EXTJS("extjs", '\ue68e'),
    FIREBASE("firebase", '\ue687'),
    FIREFOX("firefox", '\ue645'),
    FSHARP("fsharp", '\ue6a7'),
    GHOST("ghost", '\ue61f'),
    GHOST_SMALL("ghost_small", '\ue614'),
    GIT("git", '\ue602'),
    GITHUB("github", '\ue60a'),
    GITHUB_ALT("github_alt", '\ue608'),
    GITHUB_BADGE("github_badge", '\ue609'),
    GITHUB_FULL("github_full", '\ue617'),
    GIT_BRANCH("git_branch", '\ue625'),
    GIT_COMMIT("git_commit", '\ue629'),
    GIT_COMPARE("git_compare", '\ue628'),
    GIT_MERGE("git_merge", '\ue627'),
    GIT_PULL_REQUEST("git_pull_request", '\ue626'),
    GNU("gnu", '\ue679'),
    GO("go", '\ue624'),
    GOOGLE_ANALYTICS("google_analytics", '\ue660'),
    GOOGLE_CLOUD_PLATFORM("google-cloud-platform", '\ue6b2'),
    GOOGLE_DRIVE("google_drive", '\ue631'),
    GRAILS("grails", '\ue6b3'),
    GROOVY("groovy", '\ue675'),
    GRUNT("grunt", '\ue64c'),
    GULP("gulp", '\ue663'),
    HACKERNEWS("hackernews", '\ue61a'),
    HASKELL("haskell", '\ue677'),
    HEROKU("heroku", '\ue67b'),
    HTML5("html5", '\ue636'),
    HTML5_3D_EFFECTS("html5_3d_effects", '\ue635'),
    HTML5_CONNECTIVITY("html5_connectivity", '\ue634'),
    HTML5_DEVICE_ACCESS("html5_device_access", '\ue633'),
    HTML5_MULTIMEDIA("html5_multimedia", '\ue632'),
    IE("ie", '\ue644'),
    ILLUSTRATOR("illustrator", '\ue6b4'),
    INTELLIJ("intellij", '\ue6b5'),
    IONIC("ionic", '\ue6a9'),
    JAVA("java", '\ue638'),
    JAVASCRIPT("javascript", '\ue64e'),
    JAVASCRIPT_BADGE("javascript_badge", '\ue681'),
    JAVASCRIPT_SHIELD("javascript_shield", '\ue64f'),
    JEKYLL_SMALL("jekyll_small", '\ue60d'),
    JENKINS("jenkins", '\ue667'),
    JIRA("jira", '\ue65c'),
    JOOMLA("joomla", '\ue641'),
    JQUERY("jquery", '\ue650'),
    JQUERY_UI("jquery_ui", '\ue654'),
    KOMODO("komodo", '\ue692'),
    KRAKENJS("krakenjs", '\ue685'),
    KRAKENJS_BADGE("krakenjs_badge", '\ue684'),
    LARAVEL("laravel", '\ue63f'),
    LESS("less", '\ue658'),
    LINUX("linux", '\ue612'),
    MAGENTO("magento", '\ue640'),
    MAILCHIMP("mailchimp", '\ue69a'),
    MARKDOWN("markdown", '\ue63e'),
    MATERIALIZECSS("materializecss", '\ue6b6'),
    METEOR("meteor", '\ue6a5'),
    METEORFULL("meteorfull", '\ue6a6'),
    MITLICENCE("mitlicence", '\ue68b'),
    MODERNIZR("modernizr", '\ue620'),
    MONGODB("mongodb", '\ue6a4'),
    MOOTOOLS("mootools", '\ue690'),
    MOOTOOLS_BADGE("mootools_badge", '\ue68f'),
    MOZILLA("mozilla", '\ue686'),
    MSQL_SERVER("msql_server", '\ue67c'),
    MYSQL("mysql", '\ue604'),
    NANCY("nancy", '\ue666'),
    NETBEANS("netbeans", '\ue69b'),
    NETMAGAZINE("netmagazine", '\ue62e'),
    NGINX("nginx", '\ue676'),
    NODEJS("nodejs", '\ue619'),
    NODEJS_SMALL("nodejs_small", '\ue618'),
    NPM("npm", '\ue61e'),
    ONEDRIVE("onedrive", '\ue662'),
    OPENSHIFT("openshift", '\ue6b7'),
    OPENSOURCE("opensource", '\ue671'),
    OPERA("opera", '\ue646'),
    PERL("perl", '\ue669'),
    PHONEGAP("phonegap", '\ue630'),
    PHOTOSHOP("photoshop", '\ue6b8'),
    PHP("php", '\ue63d'),
    POSTGRESQL("postgresql", '\ue66e'),
    PROLOG("prolog", '\ue6a1'),
    PYTHON("python", '\ue63c'),
    RACKSPACE("rackspace", '\ue6b9'),
    RAPHAEL("raphael", '\ue65f'),
    RASPBERRY_PI("raspberry_pi", '\ue622'),
    REACT("react", '\ue6ba'),
    REDHAT("redhat", '\ue6bb'),
    REDIS("redis", '\ue66d'),
    REQUIREJS("requirejs", '\ue670'),
    RESPONSIVE("responsive", '\ue697'),
    RUBY("ruby", '\ue639'),
    RUBY_ON_RAILS("ruby_on_rails", '\ue63b'),
    RUBY_ROUGH("ruby_rough", '\ue691'),
    RUST("rust", '\ue6a8'),
    SAFARI("safari", '\ue648'),
    SASS("sass", '\ue64b'),
    SCALA("scala", '\ue637'),
    SCRIPTCS("scriptcs", '\ue6bc'),
    SCRUM("scrum", '\ue6a0'),
    SENCHATOUCH("senchatouch", '\ue68c'),
    SIZZLEJS("sizzlejs", '\ue688'),
    SMASHING_MAGAZINE("smashing_magazine", '\ue62d'),
    SNAP_SVG("snap_svg", '\ue65e'),
    SQLLITE("sqllite", '\ue6c4'),
    STACKOVERFLOW("stackoverflow", '\ue610'),
    STREAMLINE("streamline", '\ue605'),
    STYLUS("stylus", '\ue659'),
    SWIFT("swift", '\ue655'),
    SYMFONY("symfony", '\ue656'),
    SYMFONY_BADGE("symfony_badge", '\ue657'),
    TECHCRUNCH("techcrunch", '\ue62c'),
    TERMINAL("terminal", '\ue695'),
    TERMINAL_BADGE("terminal_badge", '\ue6a2'),
    TRAVIS("travis", '\ue67e'),
    TRELLO("trello", '\ue65a'),
    TYPO3("typo3", '\ue672'),
    UBUNTU("ubuntu", '\ue63a'),
    UIKIT("uikit", '\ue673'),
    UNITY_SMALL("unity_small", '\ue621'),
    VIM("vim", '\ue6c5'),
    VISUALSTUDIO("visualstudio", '\ue60c'),
    W3C("w3c", '\ue66c'),
    WEBPLATFORM("webplatform", '\ue66f'),
    WINDOWS("windows", '\ue60f'),
    WORDPRESS("wordpress", '\ue60b'),
    YAHOO("yahoo", '\ue615'),
    YAHOO_SMALL("yahoo_small", '\ue62b'),
    YEOMAN("yeoman", '\ue67a'),
    YII("yii", '\ue682'),
    ZEND("zend", '\ue678');

    private static final String ERROR_DESCRIPTION_BLANK = "Argument 'description' must not be blank";

    public static DevIconFont findByDescription(@Nonnull String description) {
        requireNonBlank(description, "Icon description must not be blank.");

        String[] parts = description.split(":");
        for (DevIconFont font : values()) {
            if (font.getDescription().equals(parts[0])) {
                return font;
            }
        }

        throw new IllegalArgumentException("Icon description '" + description + "' is invalid!");
    }

    private String description;
    private char code;

    DevIconFont(@Nonnull String description, char code) {
        this.description = description;
        this.code = code;
    }

    @Nonnull
    public String getDescription() {
        return description;
    }

    public char getCode() {
        return code;
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid DevIcon icon description");
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description, Exception e) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid DevIcon icon description", e);
    }
}