package com.webtrends.harness.component.netty.route

import com.webtrends.harness.command.BaseCommandResponse

case class NettyCommandResponse[T](override val data: Option[T],
                                   responseType: String = "application/json"
                                  ) extends BaseCommandResponse[T]
