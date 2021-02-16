package com.aoxing.mymvvm.model

import androidx.recyclerview.widget.DiffUtil

data class TopArticle(
    var data: MutableList<HomeArticle.Data> = mutableListOf(),
    var errorCode: String = "",
    var errorMsg: String = ""
)

data class HomeArticle(
    var curPage: Int = 0,
    var datas: MutableList<Data> = mutableListOf(),
    var offset: Int = 0,
    var over: Boolean = false,
    var pageCount: Int = 0,
    var size: Int = 0,
    var total: Int = 0
) {
    data class Data(
        var top: Int = 0,
        var curPage: Int = 0,
        var imagePath: String = "",
        var apkLink: String = "",
        var audit: Int = 0,
        var author: String = "",
        var canEdit: Boolean = false,
        var chapterId: Int = 0,
        var chapterName: String = "",
        var collect: Boolean = false,
        var courseId: Int = 0,
        var desc: String = "",
        var descMd: String = "",
        var envelopePic: String = "",
        var fresh: Boolean = false,
        var host: String = "",
        var id: Int = 0,
        var link: String = "",
        var niceDate: String = "",
        var niceShareDate: String = "",
        var origin: String = "",
        var prefix: String = "",
        var projectLink: String = "",
        var publishTime: Long = 0,
        var realSuperChapterId: Int = 0,
        var selfVisible: Int = 0,
        var shareDate: Long = 0,
        var shareUser: String = "",
        var superChapterId: Int = 0,
        var superChapterName: String = "",
        var tags: List<Tag> = listOf(),
        var title: String = "",
        var type: Int = 0,
        var userId: Int = 0,
        var visible: Int = 0,
        var zan: Int = 0
    ) {
        companion object {
            val diffCallback = object : DiffUtil.ItemCallback<Data>() {
                override fun areItemsTheSame(oldItem: Data, newItem: Data) =
                    oldItem.id == newItem.id

                override fun areContentsTheSame(oldItem: Data, newItem: Data) = oldItem == newItem

            }
        }
    }

    data class Tag(
        var name: String = "",
        var url: String = ""
    )
}