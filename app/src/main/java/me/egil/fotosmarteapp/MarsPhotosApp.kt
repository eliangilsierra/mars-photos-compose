package me.egil.fotosmarteapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import me.egil.fotosmarteapp.ui.screen.HomeScreen
import me.egil.fotosmarteapp.ui.screen.MarsViewModel

@Composable
fun MarsPhotosApp() {
    val viewModel: MarsViewModel = viewModel(factory = MarsViewModel.Factory)

    Scaffold { innerPadding ->
        HomeScreen(
            marsUiState = viewModel.marsUiState,
            retryAction = viewModel::getMarsPhotos,
            modifier = Modifier.padding(innerPadding)
        )
    }
}
