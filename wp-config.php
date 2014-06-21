<?php
/** Enable W3 Total Cache */
define('WP_CACHE', true); // Added by W3 Total Cache

/**
 * The base configurations of the WordPress.
 *
 * This file has the following configurations: MySQL settings, Table Prefix,
 * Secret Keys, WordPress Language, and ABSPATH. You can find more information
 * by visiting {@link http://codex.wordpress.org/Editing_wp-config.php Editing
 * wp-config.php} Codex page. You can get the MySQL settings from your web host.
 *
 * This file is used by the wp-config.php creation script during the
 * installation. You don't have to use the web site, you can just copy this file
 * to "wp-config.php" and fill in the values.
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define('DB_NAME', 'bhaaie_wp');

/** MySQL database username */
define('DB_USER', 'bhaaie');

/** MySQL database password */
define('DB_PASSWORD', );

/** MySQL hostname */
define('DB_HOST', 'localhost');

/** Database Charset to use in creating database tables. */
define('DB_CHARSET', 'utf8');

/** The Database Collate type. Don't change this if in doubt. */
define('DB_COLLATE', '');

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define('AUTH_KEY',         '^U%#7a{s63I2#7_GFYf`_r2gNN+|BU@%n+?.W!U+OwD|{60!E!OjMLdV[3^pG*+3');
define('SECURE_AUTH_KEY',  '$rR-%|n^zHNk.4^[|[;V{}<n%BdX.<n=BXZDJ-sj-hn&tm}C .xyzyi*WN`Ipp?|');
define('LOGGED_IN_KEY',    'z|p`cwAH#d[a)-+^b`o.DBCD6gXHY+9Vi{+`M7Wz?v<+hcPb~aE&-gtM._c%rkhu');
define('NONCE_KEY',        'c[Q4G]pY?s_!-U,<j:y~Ndb8`*.nQLhNRvuEM=4P3]5+(4nZ`e}(0{FN|^H!Z-E$');
define('AUTH_SALT',        ' TzX/aQa+5G:a<6mS^.1=9eqVGf>gTh(s)aTzu]-Fi4)N6>+tE,_L[ _C9(.:v z');
define('SECURE_AUTH_SALT', '1/(zCU+_de>e+dv7epRYe=hx$4ABZdY dq[nD#+AI-Y])I%g|[jPX jM>Wb!`Sjv');
define('LOGGED_IN_SALT',   '|[uZ 37n}]M:!|//NbH%#?GlUZn,n)b_IRBhk7gbUOh}M-):Pyx7eBz=:CKP<#HE');
define('NONCE_SALT',       '@bW?ak3w%e/_y9k$-+;=FS2liD3qpXQgmj-}B*!N|.+^P=ZlobYyZ7B-1- f.m7W');

/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each a unique
 * prefix. Only numbers, letters, and underscores please!
 */
$table_prefix  = 'wp_';

/**
 * WordPress Localized Language, defaults to English.
 *
 * Change this to localize WordPress. A corresponding MO file for the chosen
 * language must be installed to wp-content/languages. For example, install
 * de_DE.mo to wp-content/languages and set WPLANG to 'de_DE' to enable German
 * language support.
 */
define('WPLANG', '');
define('WP_POST_REVISIONS',false);
define('WP_POST_REVISIONS',1);

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 */
define('WP_DEBUG',false);
define('WP_DEBUG_LOG',true);
define('WP_DEBUG_DISPLAY',false);
define('EMP_SHARED_CUSTOM_FIELDS',true);


@ini_set( 'log_errors', 1 );
@ini_set( 'error_log', dirname(__FILE__) . '/wp-content/debug.log' ); 
@ini_set( 'error_reporting', E_ALL ^ E_NOTICE );

/* That's all, stop editing! Happy blogging. */

/** Absolute path to the WordPress directory. */
if ( !defined('ABSPATH') )
	define('ABSPATH', dirname(__FILE__) . '/');

/** Sets up WordPress vars and included files. */
require_once(ABSPATH . 'wp-settings.php');