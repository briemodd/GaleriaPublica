package modesto.gabriele.galeriapublica;

import android.content.Context;
import android.provider.MediaStore;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GalleryRepository {
    Context context;

    public GalleryRepository(Context context) {
        this.context = context;
    }

    public List<ImageData> loadImageData(Integer limit, Integer offSet) throws FileNotFoundException {

        List<ImageData> imageDataList = new ArrayList<>();
        int w = (int)context.getResources().getDimension(R.dimen.itemWidth);
        int h = (int)context.getResources().getDimension(R.dimen.itemHeight);

        String[] projection = new String[] {MediaStore.Images.Media._ID, MediaStore.Images.Media.DISPLAY_NAME,
                MediaStore.Images.Media.DATE_ADDED,
                MediaStore.Images.Media.SIZE};
        String selection = null;
        String selectionArgs[] = null;
        String sort = MediaStore.Images.Media.DATE_ADDED;


        }
    }
}
