# Mars Photos Compose

An Android app built with **Jetpack Compose** that consumes NASA's Mars Rover Photos REST API, following an MVVM architecture with a repository layer, `Retrofit`/`OkHttp` networking, and explicit UI state modeling for loading, success, and error cases.

## Features

- Fetches and displays a live-updated grid of Mars rover photos from a public REST endpoint.
- Explicit `MarsUiState` sealed interface (`Loading`, `Success`, `Error`) driving what the UI renders at any given time.
- Graceful error handling with a retry action when the network call fails.
- Adaptive `LazyVerticalGrid` layout with image loading, placeholders, and crossfade transitions via Coil.
- Dependency injection of the repository through a lightweight `AppContainer`, avoiding a DI framework for a small app surface.

## Tech stack & architecture

| Layer | Technology |
|---|---|
| UI | Jetpack Compose, Material 3 |
| State management | `ViewModel` + Compose `State`, unidirectional data flow |
| Networking | Retrofit 2, OkHttp, kotlinx.serialization |
| Image loading | Coil |
| Language | Kotlin |
| Build | Gradle Kotlin DSL, version catalogs (`libs.versions.toml`) |

The app follows a simple MVVM structure:

```
network/    -> Retrofit service + DTOs (MarsApiService, MarsPhoto)
data/       -> Repository + manual DI container (MarsPhotosRepository, AppContainer)
ui/screen/  -> ViewModel + Composable screens (MarsViewModel, HomeScreen)
```

`MarsViewModel` exposes a single `marsUiState` property backed by Compose state; `HomeScreen` reacts to it with a `when` expression that renders a loading spinner, an error screen with retry, or a photo grid — no manual observer wiring required.

## Getting started

**Requirements:** Android Studio (current stable), JDK 17+, Android SDK with API 36.

```bash
git clone https://github.com/eliangilsierra/mars-photos-compose.git
cd mars-photos-compose
./gradlew assembleDebug
```

Open the project in Android Studio and run the `app` configuration on an emulator or device (minSdk 26).

## Academic context

Developed as an exercise for the **Desarrollo de Aplicaciones Móviles** course, taught by professor **Fabián Enrique Suárez Carvajal** — Maestría en Gestión, Aplicación y Desarrollo de Software (MGADS), Universidad Autónoma de Bucaramanga (UNAB).

## License

MIT — see [LICENSE](LICENSE).
