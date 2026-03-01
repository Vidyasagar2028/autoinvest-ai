# AutoInvest AI Android App

AutoInvest AI is a Kotlin-based Android app with:

- Login screen (email + password)
- Dashboard screen
- Auto-invest toggle button
- Portfolio summary cards
- Modern Material 3 UI
- Dark mode support

## Project Structure

- `app/src/main/java/com/autoinvestai/MainActivity.kt` - app entry point
- `app/src/main/java/com/autoinvestai/navigation/AppScreen.kt` - screen routes
- `app/src/main/java/com/autoinvestai/ui/AutoInvestAiApp.kt` - app navigation host
- `app/src/main/java/com/autoinvestai/ui/screens/LoginScreen.kt` - login UI
- `app/src/main/java/com/autoinvestai/ui/screens/DashboardScreen.kt` - dashboard UI
- `app/src/main/java/com/autoinvestai/ui/theme/*` - Material 3 theming and dark mode

## Build

```bash
./gradlew :app:assembleDebug
```
