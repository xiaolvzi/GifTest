using Android.App;
using Android.Widget;
using Android.OS;
using Com.Facebook.Drawee.Backends.Pipeline;
using Android.Net;
using Com.Facebook.Drawee.Interfaces;
using Com.Facebook.Drawee.View;
using Android.Util;
using Com.Facebook.Imagepipeline.Request;
using Com.Facebook.Drawee.Controller;
using Android.Graphics.Drawables;
using Java.Lang;
using Com.Bumptech.Glide;

namespace FrescoGifTest
{
    [Activity(Label = "FrescoGifTest", MainLauncher = true)]
    public class MainActivity : Activity
    {
        
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            Fresco.Initialize(this);
            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);

            Uri uri = Uri.Parse("http://img.huofar.com/data/jiankangrenwu/shizi.gif");
            
            PipelineDraweeControllerBuilder pdcb= (PipelineDraweeControllerBuilder)Fresco.NewDraweeControllerBuilder().SetAutoPlayAnimations(true);
            IDraweeController draweeController = pdcb.SetUri(uri).Build();

            SimpleDraweeView img = FindViewById<SimpleDraweeView>(Resource.Id.img);
            ImageView imge = FindViewById<ImageView>(Resource.Id.imge);
            img.Controller=draweeController;

            Glide.With(this).Load(uri).Into(imge);
            
            

        }
    }
}

