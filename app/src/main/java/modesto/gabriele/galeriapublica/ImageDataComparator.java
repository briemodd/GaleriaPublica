package modesto.gabriele.galeriapublica;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

//mostra ao adapter como verificar se os dois imagedata sao iguais
public class ImageDataComparator extends DiffUtil.ItemCallback<ImageData> {
    @Override
    public boolean areItemsTheSame(@NonNull ImageData oldItem, @NonNull ImageData newItem) {
        return oldItem.uri.equals(newItem.uri);
    }

    @Override
    public boolean areContentsTheSame(@NonNull ImageData oldItem, @NonNull ImageData newItem) {
        return oldItem.uri.equals(newItem.uri);
    }
}
