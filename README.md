# KAI brand assets · identity-v1.4.0

Official logo, app icon, favicon, token and template files for **KAI**, the B2B AI operational platform by KUEM.
Read `guidelines/KAI-brand-guidelines-identity-v1.4.0.pdf` before using any file.

| Folder | Contents |
| --- | --- |
| `logos/svg`, `logos/png` | Symbol, small-size symbol (24 px and below), wordmark, lockup and "KAI by KUEM" endorsed lockup in `positive`, `on-dark`, `white` and `black`. PNG names end in their height (`-128h`). |
| `app-icons/master` | 1024 px square app icon (opaque) and SVG. Operating systems apply their own mask. |
| `app-icons/ios` | `AppIcon.appiconset` for Xcode 16+: default, dark and tinted 1024 px icons. |
| `app-icons/android` | Adaptive icon resources (`res/`) with vector foreground, monochrome layer and background colour; push notification small icon (`kai_ic_notification.xml`); legacy PNG launchers; 512 px Play Store icon. |
| `app-icons/web` | PWA icons (192, 512, maskable 512), Apple touch icon and a manifest snippet. |
| `favicons` | `favicon.svg`, `favicon.ico` (16/32/48) and PNGs, plus an HTML snippet. |
| `tokens` | `kai.tokens.css` (custom properties for light, dark and high-contrast modes) and resolved JSON per mode. |
| `icons/state` | The 14 KAI state icons (AI information types and system states): `svg/` for web (`currentColor`), `android/` VectorDrawable XML, `ios/KaiStateIcons.xcassets` (template rendering). 24 px grid, tested at 16, 20 and 24 px. |
| `templates` | 1200 × 630 link-preview image, 1024 px social avatar, HTML email signature with logo. |
| `templates/office` | Microsoft Office templates: `kai-deck.potx` (16:9 slides), `kai-report.dotx`, `kai-letter.dotx` and `kai-product-sheet.dotx` (A4). They use IBM Plex as theme fonts and fall back to Arial when Plex is not installed. |
| `guidelines` | Brand guidelines (PDF). |

## What is new in identity-v1.4.0
- State icons in `icons/state` for web, Android and iOS, generated from the same masters.
- Android push notification small icon.
- Guidelines: new pages on the app shell and general app patterns, notifications, and building apps with KAI.
- Tokens, logos, app icons, favicons and templates are unchanged from identity-v1.3.0, apart from the version line in each file comment.

## Earlier: identity-v1.3.0
- Tokens (additive only; no token was renamed or removed): sequential and diverging chart scales (`color.data.seq.*`, `color.data.div.*`, `color.chart.seq.*`, `color.chart.div.*`), the brand-moment duration and easing, and transition roles (`motion.transition.*`).
- Office templates in `templates/office`.
- Guidelines: new pages on chart scales, product screens, evidence, confirmation, motion, voice and office templates.
- Logo, app-icon and favicon artwork is unchanged from identity-v1.0.0; only the version line in each SVG comment differs.

## Rules in short
- Use the files as they are: no recolouring, stretching, effects or redrawing. State icons are the exception: colour them with the KAI tokens, and keep each icon's meaning.
- "KAI by KUEM" is for public, sales, store and legal surfaces only; inside the product, use the plain lockup.
- Brand colour never signals status. Use the status tokens and icons for that.
- Fonts (IBM Plex Sans and Mono, SIL OFL 1.1) are not included; get them from IBM's official Plex releases.
- Font Awesome icons are licensed to KUEM and are not part of this kit.

## Integrity
`MANIFEST.sha256` lists a SHA-256 checksum for every file. Check with `sha256sum -c MANIFEST.sha256`.

## Licence
See `LICENSE.md`. In short: logos, symbol and app icons are © KUEM, all rights reserved; files in `tokens/` are MIT licensed (`LICENSE-TOKENS.txt`).
